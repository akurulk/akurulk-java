package com.kodeincloud.akurulk;

import java.util.HashMap;

/**
 * In Sinhala unicode default character set is not enough to render the total words
 * Then addition fixes needed to enable in the font.
 * In android these fixes does not identified by default. Then we need to give a fix for that.
 * 
 * This HashMap does that
 */
public class ComplexFixes extends HashMap<String, Character> {

	public ComplexFixes() {
		
		//for AE
		put("රැ",  (char) 65423);
		
		//for AEE
		put("රැ",  (char) 65424);
		
		//for I 
		put("ක" + (char)0x0DD2,  (char) 65295);
		put("ඛ" + (char)0x0DD2,  (char) 65304);
		put("ච" + (char)0x0DD2,  (char) 65312);
		put("ජ" + (char)0x0DD2,  (char) 65319);
		put("ඡ" + (char)0x0DD2,  (char) 65326);
		put("" + (char)0x0DA3 + (char)0x0DD2,  (char) 65333);
		put("ට" + (char)0x0DD2,  (char) 65345);
		put("ඨ" + (char)0x0DD2,  (char) 65351);
		put("ඩ" + (char)0x0DD2,  (char) 65357);
		put("ඪ" + (char)0x0DD2,  (char) 65363);
		put("ණ" + (char)0x0DD2,  (char) 65369);
		put("ථ" + (char)0x0DD2,  (char) 65374);
		put("ද" + (char)0x0DD2,  (char) 65379);
		put("ධ" + (char)0x0DD2,  (char) 65387);
		put("ඳ" + (char)0x0DD2,  (char) 65393);
		put("ඵ" + (char)0x0DD2,  (char) 65397);
		put("බ" + (char)0x0DD2,  (char) 65403);
		put("ම" + (char)0x0DD2,  (char) 65410);
		put("ඹ" + (char)0x0DD2,  (char) 65417);
		put("ර" + (char)0x0DD2,  (char) 65425);
		put("ව" + (char)0x0DD2,  (char) 65436);
		
		//for Ie
		put("ක" + (char)0x0DD3,  (char) 65296);
		put("ඛ" + (char)0x0DD3,  (char) 65306);
		put("ච" + (char)0x0DD3,  (char) 65313);
		put("ජ" + (char)0x0DD3,  (char) 65320);
		put("ඡ" + (char)0x0DD3,  (char) 65327);
		put("" + (char)0x0DA3 + (char)0x0DD3,  (char) 65334);
		put("ට" + (char)0x0DD3,  (char) 65346);
		put("ඨ" + (char)0x0DD3,  (char) 65352);
		put("ඩ" + (char)0x0DD3,  (char) 65358);
		put("ඪ" + (char)0x0DD3,  (char) 65364);
		put("ණ" + (char)0x0DD3,  (char) 65370);
		put("ථ" + (char)0x0DD3,  (char) 65375);
		put("ද" + (char)0x0DD3,  (char) 65380);
		put("ධ" + (char)0x0DD3,  (char) 65388);
		put("ඳ" + (char)0x0DD3,  (char) 65394);
		put("ඵ" + (char)0x0DD3,  (char) 65398);
		put("බ" + (char)0x0DD3,  (char) 65404);
		put("ම" + (char)0x0DD3,  (char) 65411);
		put("ඹ" + (char)0x0DD3,  (char) 65418);
		put("ර" + (char)0x0DD3,  (char) 65426);
		put("ව" + (char)0x0DD3,  (char) 65436);
		
		//for u
		put("ක" + (char)0x0DD4,  (char) 65297);
		put("" + (char)0x0DA4 + (char)0x0DD4,  (char) 65339);
		put("ද" + (char)0x0DD4,  (char) 65381);
		put("ඳ" + (char)0x0DD4,  (char) 65395);
		put("ල" + (char)0x0DD4,  (char) 65433);
		
		//for uu
		put("ක" + (char)0x0DD6,  (char) 65298);
		put("" + (char)0x0DA5 + (char)0x0DD4,  (char) 65340);
		put("ද" + (char)0x0DD6,  (char) 65382);
		put("ඳ" + (char)0x0DD6,  (char) 65396);
		put("ල" + (char)0x0DD6,  (char) 65434);
		
		//for hal
		put("ක" + (char)0x0DCA,  (char) 65294);
		put("ඛ" + (char)0x0DCA,  (char) 65303);
		put("ච" + (char)0x0DCA,  (char) 65311);
		put("ජ" + (char)0x0DCA,  (char) 65318);
		put("ඡ" + (char)0x0DCA,  (char) 65325);
		put("" + (char)0x0DCA + (char)0x0DD2,  (char) 65332);
		put("ට" + (char)0x0DCA,  (char) 65344);
		put("ඩ" + (char)0x0DCA,  (char) 65356);
		put("ණ" + (char)0x0DCA,  (char) 65368);
		put("ධ" + (char)0x0DCA,  (char) 65386);
		put("ඵ" + (char)0x0DCA,  (char) 65396);
		put("බ" + (char)0x0DCA,  (char) 65402);
		put("ම" + (char)0x0DCA,  (char) 65409);
		put("ඹ" + (char)0x0DCA,  (char) 65416);
		put("ර" + (char)0x0DCA,  (char) 65424);
		put("ව" + (char)0x0DCA,  (char) 65435);
		
		//for yansaya
		put("ය" + (char)0x0DD4,  (char) 65420);
		put("ය" + (char)0x0DD6,  (char) 65421);
	}
}
