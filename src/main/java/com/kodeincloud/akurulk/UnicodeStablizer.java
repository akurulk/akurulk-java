package com.kodeincloud.akurulk;

import com.kodeincloud.akurulk.base.Tokenizer;
import com.kodeincloud.akurulk.base.TokenizerListener;

/**
 *
 * Stabilize given set of Unicode charaters into a renderable order
 */
public class UnicodeStablizer {

	private Tokenizer t = new Tokenizer();
	private ComplexFixes fixes = new ComplexFixes();
	private StringBuffer stablized ;
	private char[] halKura = new char[2];
	
	/**
	 * Stablize given text into a renderable format
	 * @param text
	 * @return
	 */
	public StringBuffer stabilize() {
		
		if(stablized!= null) {
			//if already stabilized
			return stablized;
		} else {
			stablized = new StringBuffer();
		}
		
		t.setListener(new TokenizerListener() {
			
			public void onVowel(char vowel) {
				
				flushHal();
				stablized.append(vowel);
			}
			
			public void onConsonant(char consonant) {
				
				
				if(halKura[0] !=0 && consonant == (char) 0x0DBA) {
					//for layanna add yansaya if hal akurukak exists
					stablized.append(halKura[0]);
					stablized.append((char)65419);
					cleanHal();
					
				} else {
					flushHal();
					stablized.append(consonant);
				}
				
			}
			
			public void onMixed(char part1, char part2) {
				
				if(halKura[0] !=0 && part1 == (char) 0x0DBA) {
					//handling yansaya for mixed chartors
					
					stablized.append(halKura[0]);
					
					Character fixed = fixes.get("" + part1 + part2);
					if(fixed != null) {
						stablized.append(fixed);
					} else {
						stablized.append((char)65419);
						stablized.append(part2);
					}
					
					//done the job
					return;
				} 
				
				flushHal();
				Character fixed = null;
				
				if(part2 == (char) 0x0DCA) {
					//if this is HAL akuru
					halKura[0] = part1;
					halKura[1] = part2;
					
				} else if((fixed = fixes.get("" + part1 + part2)) != null) {
					stablized.append(fixed);
				} else if(part2 == (char)0x0DD9) {
					//for ae
					stablized.append((char)0x0DD9);
					stablized.append(part1);
				} else if(part2 == (char)0x0DDA) {
					//for diga ae
					stablized.append((char)0x0DD9);
					stablized.append(part1);
					stablized.append((char) 0x0DCA);
				} else if(part2 == (char)0x0DDB) {
					//for ei
					stablized.append((char)0x0DDB);
					stablized.append(part1);
				} else if(part2 == (char)0x0DDC) {
					//for o
					stablized.append((char)0x0DD9);
					stablized.append(part1);
					stablized.append((char) 0x0DCF);
				} else if(part2 == (char)0x0DDD) {
					//for diga o
					stablized.append((char)0x0DD9);
					stablized.append(part1);
					stablized.append((char) 65281);
				} else if(part2 == (char)0x0DDE) {
					//for au
					stablized.append((char)0x0DD9);
					stablized.append(part1);
					stablized.append((char) 0x0DDF);
				} else {
					stablized.append(part1);
					stablized.append(part2);
				}
			}
			
			public void onOther(char other) {
				
				if(other == (char) 8205) {
					//on ZWJ ignore it
				} else {
					flushHal();
					stablized.append(other);
				}
			}

		
		});
		
		return stablized;
	}
	
	public UnicodeStablizer write(String chunk) {
		t.write(chunk);
		return this;
	}
	
	public void flush() {
		
		t.flush();
		flushHal();
	}
	
	
	private void flushHal() {
		
		if(halKura[0] != 0 && halKura[1] != 0) {
			stablized.append(halKura[0]);
			stablized.append(halKura[1]);
		}
		
		cleanHal();
	}
	
	private void cleanHal() {
		
		halKura[0] = 0;
		halKura[1] = 0;
	}
	
	private boolean halExists() {
		return halKura[0] != 0;
	}
	
}
