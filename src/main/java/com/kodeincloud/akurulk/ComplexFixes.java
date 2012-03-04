package com.kodeincloud.akurulk;

import java.util.HashMap;

/**
 * In Sinhala unicode default character set is not enough to render the total words
 * Then addition fixes needed to enable in the font.
 * In android these fixes does not identified by default. Then we need to give a fix for that.
 * 
 * This HashMap does that
 */
public class ComplexFixes extends HashMap<String, String> {

	public ComplexFixes() {
		
		//for AE
		put("රැ",  "" + (char) 948);
		
		//for AEE
		put("රැ", "" +  (char) 964);
//		
//		//for I 
//		put("ක" + (char)0x0DD2,  "" + (char) 65295);
		put("ඛ" + (char)0x0DD2, "" +  (char) 1098);
		put("ච" + (char)0x0DD2,  "" + (char) 1110);
		put("ජ" + (char)0x0DD2,  "" + (char) 1141);
		put("ඡ" + (char)0x0DD2,  "" + (char) 1154);
		put("" + "" + (char)0x0DA3 + (char)0x0DD2, "" +  (char) 1076);
		put("ට" + (char)0x0DD2,  "" + (char) 1125);
		put("ඨ" + (char)0x0DD2,  "" + (char) 1093);
		put("ඩ" + (char)0x0DD2,  "" + (char) 1129);
		put("ඪ" + (char)0x0DD2,  "" + (char) 1107);
//		put("ණ" + (char)0x0DD2, "" +  (char) 65369);
		put("ථ" + (char)0x0DD2,  "" + (char) 1111);
		put("ද" + (char)0x0DD2,  "" + (char) 1068);
		put("ධ" + (char)0x0DD2, "" +  (char) 1135);
		put("ඳ" + (char)0x0DD2,  "" + (char) 1063);
		put("ඵ" + (char)0x0DD2,  "" + (char) 1122);
		put("බ" + (char)0x0DD2,  "" + (char) 1137);
		put("ම" + (char)0x0DD2,  "" + (char) 1142);
		put("ඹ" + (char)0x0DD2,  "" + (char) 1145);
		put("ර" + (char)0x0DD2, "" +  (char) 1106);
		put("ව" + (char)0x0DD2, "" +  (char) 1150);
//		
//		//for Ie
//		put("ක" + (char)0x0DD2, "" +  (char) 65295);
		put("ඛ" + (char)0x0DD2, "" +  (char) 1100);
		put("ච" + (char)0x0DD2, "" +  (char) 1115);
		put("ජ" + (char)0x0DD2, "" +  (char) 1113);
		put("ඡ" + (char)0x0DD2, "" +  (char) 1095);
		put("" + "" + (char)0x0DA3 + (char)0x0DD2,  "" + (char) 1077);
		put("ට" + (char)0x0DD2, "" +  (char) 1126);
		put("ඨ" + (char)0x0DD2, "" +  (char) 1094);
		put("ඩ" + (char)0x0DD2, "" +  (char) 1128);
		put("ඪ" + (char)0x0DD2, "" +  (char) 1109);
//		put("ණ" + (char)0x0DD2, "" +  (char) 65369);
		put("ථ" + (char)0x0DD2, "" +  (char) 1112);
		put("ද" + (char)0x0DD2,  "" + (char) 1101);
		put("ධ" + (char)0x0DD2, "" +  (char) 1136);
		put("ඳ" + (char)0x0DD2, "" +  (char) 1064);
		put("ඵ" + (char)0x0DD2, "" +  (char) 1119);
		put("බ" + (char)0x0DD2, "" +  (char) 1139);
		put("ම" + (char)0x0DD2,  "" + (char) 1144);
		put("ඹ" + (char)0x0DD2, "" +  (char) 1147);
		put("ර" + (char)0x0DD2,  "" + (char) 1124);
		put("ව" + (char)0x0DD2,  "" + (char) 1151);
//		
//		//for u
		put("ක" + (char)0x0DD4,  "" + (char) 1009 + (char) 962);
		put("ත" + (char)0x0DD4,  "" + (char) 960 + (char) 962);
//		put("" +"" +  (char)0x0DA4 + (char)0x0DD4,  "" + (char) 1152);
		put("ද" + (char)0x0DD4,  "" + (char) 1156);
		put("ඳ" + (char)0x0DD4, "" +  (char) 1148);
		put("ල" + (char)0x0DD4, "" +  (char) 1069);
		put("ළ" + (char)0x0DD4, "" +  (char) 1092);
		put("ර" + (char)0x0DD4, "" +  (char) 1015 + (char) 1002);
//		
//		//for uu
		put("ක" + (char)0x0DD6,  "" + (char) 1009 + (char) 944);
		put("ත" + (char)0x0DD6,  "" + (char) 960 + (char) 944);
//		put("" +"" +  (char)0x0DA6 + (char)0x0DD4,  "" + (char) 1152);
		put("ද" + (char)0x0DD6,  "" + (char) 1166);
		put("ඳ" + (char)0x0DD6, "" +  (char) 1071);
		put("ල" + (char)0x0DD6, "" +  (char) 1099);
		put("ළ" + (char)0x0DD6, "" +  (char) 1092 + (char) 982);
		put("ර" + (char)0x0DD6, "" +  (char) 1015 + (char) 970);
//		
//		//for hal
//		put("ක" + (char)0x0DCA, "" +  (char) 65294);
		put("ඛ" + (char)0x0DCA,"" +  (char) 1097);
		put("ච" + (char)0x0DCA, "" +  (char) 1102);
		put("ජ" + (char)0x0DCA, "" +  (char) 1103);
		put("ඡ" + (char)0x0DCA, "" +  (char) 1155);
//		put("" + (char)0x0DCA + (char)0x0DD2, "" +  (char) 65332);
		put("ට" + (char)0x0DCA,  "" + (char) 1121);
		put("ඩ" + (char)0x0DCA, "" +  (char) 1127);
//		put("ණ" + (char)0x0DCA, "" +  (char) 65368);
		put("ධ" + (char)0x0DCA, "" +  (char) 1133);
//		put("ඵ" + (char)0x0DCA, "" +  (char) 65396);
		put("බ" + (char)0x0DCA, "" +  (char) 1138);
		put("ම" + (char)0x0DCA, "" +  (char) 1140);
//		put("ඹ" + (char)0x0DCA, "" +  (char) 1081);
		put("ර" + (char)0x0DCA, "" +  (char) 1091);
		put("ව" + (char)0x0DCA, "" +  (char) 1146);
//		
//		//for yansaya
//		put("ය" + (char)0x0DD4, "" +  (char) 65420);
//		put("ය" + (char)0x0DD6,  "" + (char) 65421);
	}
}
