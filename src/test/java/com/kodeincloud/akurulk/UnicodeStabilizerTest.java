package com.kodeincloud.akurulk;

import junit.framework.TestCase;

public class UnicodeStabilizerTest extends TestCase{

	public void testAe() {
		
		assertEquals(AkuruLK.convert(" ශේත්‍ර "), " ෙශ්ත්ර ");
		assertEquals(AkuruLK.convert("හල්"), "හල්");
	}
}
