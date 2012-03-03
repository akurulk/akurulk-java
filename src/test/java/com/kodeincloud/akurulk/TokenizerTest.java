package com.kodeincloud.akurulk;

import com.kodeincloud.akurulk.base.Tokenizer;
import com.kodeincloud.akurulk.base.TokenizerListener;

import junit.framework.TestCase;

public class TokenizerTest extends TestCase{

	public void testTokenize() {
		
		Tokenizer t = new Tokenizer();
		t.setListener(new TokenizerListener() {
			
			public void onVowel(char vowel) {
				System.out.println("Vowel" + vowel);				
			}
			
			public void onOther(char other) {
				
				System.out.println("Other" + other);
			}
			
			public void onMixed(char part1, char part2) {
				
				System.out.println("Mixed" + part1 + "," + part2);
			}
			
			public void onConsonant(char consonant) {
				System.out.println("Consonant" + consonant);
			}
		});
		
		t.write("අරුනෝද සුසිරිපාල");
		t.flush();
	}
}
