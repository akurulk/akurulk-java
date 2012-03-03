package com.kodeincloud.akurulk.base;

/**
 * Defines Sinhala Unicode Charactor Base
 */
public class UnicodeSinhala {
	
	public final static int
		INDEPENDENT_VOWEL = 4,
		CONSONANT = 8,
		DEPENDENT_VOWEL = 16,
		PUNCTUATION = 32,
		SIGN = 64,
		OTHER = 128;
	
	public static int getType(char c) {
		
		int charCode = (int) c;
		
		if(charCode >= 3482 && charCode <= 3526) {

			return UnicodeSinhala.CONSONANT;
		} else if(charCode >= 3535 && charCode <= 3571) {

			return UnicodeSinhala.DEPENDENT_VOWEL;
		} else if(charCode == 3530) {

			return UnicodeSinhala.DEPENDENT_VOWEL;
		} else if(charCode >= 3461 && charCode <= 3478) {

			return UnicodeSinhala.INDEPENDENT_VOWEL;
		} else if(charCode >= 3458 && charCode <= 3459) {

			return UnicodeSinhala.SIGN;
		} else if(charCode >= 3458 && charCode <= 3459) {

			return UnicodeSinhala.SIGN;
		} else if(charCode == 3572) {

			return UnicodeSinhala.PUNCTUATION;
		} else {

			return UnicodeSinhala.OTHER;
		}
	}
}