package com.kodeincloud.akurulk.base;

/**
 * Tokenize given string input of Sinhala Unicode into
 * 
 *   * Vowel
 *   * Consonant
 *   * Mixed 
 *   * Other
 *   
 * Act as a stream and can write
 */
public class Tokenizer {

	private TokenizerListener listener;
	private char earlyConsonant = 0;
	
	public void setListener(TokenizerListener l) {
		listener = l;
	}
	
	public void write(String chunk) {
		
		for(int lc=0; lc<chunk.length(); lc++) {
			tokenize(chunk.charAt(lc));
		}
	}
	
	private void tokenize(char character) {
		
		int type = UnicodeSinhala.getType(character);
		if(type == UnicodeSinhala.INDEPENDENT_VOWEL) {

			//this is an vowel
			if(listener != null) listener.onVowel(character);
		} else if(type == UnicodeSinhala.CONSONANT) {

			//send the early consonent and add this one to that			
			if(earlyConsonant != 0) {

				if(listener != null) listener.onConsonant(earlyConsonant);
			}
			earlyConsonant = character;
			
		} else if(type == UnicodeSinhala.DEPENDENT_VOWEL || type == UnicodeSinhala.SIGN) { 

			if(earlyConsonant != 0) {
				//if there is an early consonent send the mixed
				if(listener != null) listener.onMixed(earlyConsonant, character);
				earlyConsonant = 0;
			} else {
				//cannot have a single DEPENDENT_VOWEL or SIGN without a consion
				//just ignore it
			}
		} else {

			//this should be something else
			flush();
			if(listener != null) listener.onOther(character);
		}
	
	}
	
	public void flush() {

		if(earlyConsonant != 0) {
			if(listener != null) listener.onConsonant(earlyConsonant);
			earlyConsonant = 0;
		}
	}
}
