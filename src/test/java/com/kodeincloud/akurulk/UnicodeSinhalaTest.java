package com.kodeincloud.akurulk;

import com.kodeincloud.akurulk.base.UnicodeSinhala;

import junit.framework.TestCase;

public class UnicodeSinhalaTest extends TestCase {

	public void testConsonents() {
		
		assertEquals(UnicodeSinhala.CONSONANT, UnicodeSinhala.getType('ක'));
		assertEquals(UnicodeSinhala.CONSONANT, UnicodeSinhala.getType('ච'));
		assertEquals(UnicodeSinhala.CONSONANT, UnicodeSinhala.getType('ෆ'));
	}
	
	public void testNotAConsonents() {
		
		assertFalse(UnicodeSinhala.CONSONANT == UnicodeSinhala.getType('ා'));
	}
	
	public void testDependantVowel() {
		
		assertEquals(UnicodeSinhala.DEPENDENT_VOWEL, UnicodeSinhala.getType('්'));
		assertEquals(UnicodeSinhala.DEPENDENT_VOWEL, UnicodeSinhala.getType('ා'));
		assertEquals(UnicodeSinhala.DEPENDENT_VOWEL, UnicodeSinhala.getType('ා'));
	}
	
	public void testNotDependantVowel() {
		
		assertFalse(UnicodeSinhala.DEPENDENT_VOWEL == UnicodeSinhala.getType('ෆ'));
	}
	
	public void testIndependantVowel() {
		
		assertEquals(UnicodeSinhala.INDEPENDENT_VOWEL, UnicodeSinhala.getType('අ'));
		assertEquals(UnicodeSinhala.INDEPENDENT_VOWEL, UnicodeSinhala.getType('ඕ'));
		assertEquals(UnicodeSinhala.INDEPENDENT_VOWEL, UnicodeSinhala.getType('ඖ'));
	}
	
	public void testNotIndependantVowel() {
		
		assertFalse(UnicodeSinhala.INDEPENDENT_VOWEL == UnicodeSinhala.getType('ෆ'));
	}
	
	public void testSign() {
		
		assertEquals(UnicodeSinhala.SIGN, UnicodeSinhala.getType('ං'));
		assertEquals(UnicodeSinhala.SIGN, UnicodeSinhala.getType('ඃ'));
	}
	
	public void testNotSign() {
		
		assertFalse(UnicodeSinhala.SIGN == UnicodeSinhala.getType('ා'));
	}
	
	public void testPunctuation() {
		
		assertEquals(UnicodeSinhala.PUNCTUATION, UnicodeSinhala.getType('෴'));
	}
	
	public void testNotPunctuation() {
		
		assertFalse(UnicodeSinhala.PUNCTUATION == UnicodeSinhala.getType('ා'));
	}
}
