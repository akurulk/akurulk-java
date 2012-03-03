package com.kodeincloud.akurulk.base;

/**
 * 
 * Listener for the Tokenizer
 *
 */
public interface TokenizerListener {

	/**
	 * Called when detect an vowel
	 * @param vowel
	 */
	void onVowel(char vowel);
	
	/**
	 * Called when detect a single consonant
	 * @param vowel
	 */
	void onConsonant(char consonant);
	
	/**
	 * Called when detect consonant with some other char
	 * @param part1
	 * @param part2
	 */
	void onMixed(char part1, char part2);
	
	/**
	 * Called when found some other not handlable char
	 * @param other
	 */
	void onOther(char other);
}
