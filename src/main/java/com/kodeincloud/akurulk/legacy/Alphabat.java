package com.kodeincloud.akurulk.legacy;

import java.util.HashMap;

public class Alphabat extends HashMap<Character, String> {

	public final char YANSAYA = (char)973;
	public Alphabat() {
		
		//Various Signs
		put((char)0x0D82, "" + (char) 1021); //binduwa
		put((char)0x0D83, "" + (char) 941); //wisargay
		
		//Independent Vowels
		put((char)0x0D85, ""  + (char) 1020); //ayanna
		put((char)0x0D86, "" + (char) 1020 + (char) 1001); //aayanna
		put((char)0x0D87, "" + (char) 1020 + (char) 1002); //aeyanna
		put((char)0x0D88, "" + (char) 1020 + (char) 970); //aeeyanna
		put((char)0x0D89, "" + (char) 999); //iyanna
		put((char)0x0D8A, "" + (char) 967 ); //iiyanna
		put((char)0x0D8B, "" + (char) 988 ); //uyanna
		put((char)0x0D8C, "" + (char) 988 + (char) 934) ; //uuyanna
		put((char)0x0D8D, "" + (char) 983); //iruyanna
		put((char)0x0D8E, "" + (char) 983 + (char) 969); //iruuyanna
		put((char)0x0D8F, "" + (char) 1105); //iluyanna
		put((char)0x0D90, "" + (char) 1108 ); //iluuyanna
		put((char)0x0D91, "" + (char) 1017 ); //eyanna
		put((char)0x0D92, "" + (char) 1017 + (char) 998); //eeyanna
		put((char)0x0D93, "" + (char) 1003 + (char) 1017); //aiyanna
		put((char)0x0D94, "" + (char) 985); //oyanna
		put((char)0x0D95, "" + (char) 1143); //oyanna
		put((char)0x0D96, "" + (char) 985 + (char) 934); //auyanna
		
		//consonents
		put((char)0x0D9A, "" + (char) 1009); //kayanna
		put((char)0x0D9B, "" + (char) 977); // mahapranakayanna
		put((char)0x0D9C, "" + (char) 947); // alpapraana gayanna
		put((char)0x0D9D, "" + (char) 963); // mahaapraana gayanna
		put((char)0x0D9E, "" + (char) 1027); // kantaja naasikyaya
		put((char)0x0D9F, "" + (char) 1114); // sanyaka gayanna
		put((char)0x0DA0, "" + (char) 1013); // chayanna
		put((char)0x0DA1, "" + (char) 981); // mahaprana chayanna
		put((char)0x0DA2, "" + (char) 1000); // jayanna
		put((char)0x0DA3, "" + (char) 1075); // mahaprana jayanna
		put((char)0x0DA4, "" + (char) 992); // taaluja naasikyaya

		put((char)0x0DA5, "" + (char) 1116); // sanyooga naasikyaya
		put((char)0x0DA6, "" + (char) 997 + (char) 1000); // sanyaka jayanna
		put((char)0x0DA7, "" + (char) 1004); // tayanna
		put((char)0x0DA8, "" + (char) 972); // mahaprana tayanna
		put((char)0x0DA9, "" + (char) 1019); // dayanna
		put((char)0x0DAA, "" + (char) 987); // mahaprana dayanna
		put((char)0x0DAB, "" + (char) 976); // ana nayanna
		put((char)0x0DAC, "" + (char) 997 + (char) 1019); // sanyaka dayanna
		put((char)0x0DAD, "" + (char) 960); // thayanna
		put((char)0x0DAE, "" + (char) 959); // maharaana thayanna
		put((char)0x0DAF, "" + (char) 1012); // dayanna
		put((char)0x0DB0, "" + (char) 980); // mahaprana dayanna
		put((char)0x0DB1, "" + (char) 1008); // nayanna
		put((char)0x0DB3, "" + (char) 997 + (char) 1012); // sanyaka dayanna
		put((char)0x0DB4, "" + (char) 1010); // payanna
		put((char)0x0DB5, "" + (char) 978); // mahaprana payanna
		put((char)0x0DB6, "" + (char) 1011); // bayanna
		put((char)0x0DB7, "" + (char) 979); // mahapraana bayanna
		put((char)0x0DB8, ""  + (char) 1018); // mayanna
		put((char)0x0DB9, ""  + (char) 986); // amba bayanna
		put((char)0x0DBA, ""  + (char) 1005); // yayanna
		put((char)0x0DBB, ""  + (char) 1015); // rayanna
		put((char)0x0DBD, ""  + (char) 945); // layanna
		put((char)0x0DC0, "" + (char) 1007); // vayanna
		put((char)0x0DC1, "" + (char) 990); // taaluja sayanna
		put((char)0x0DC2, "" + (char) 974); // murdaja sayanna
		put((char)0x0DC3, "" + (char) 1006); // sayanna
		put((char)0x0DC4, ""  + (char) 1022); // hayanna
		put((char)0x0DC5, "" + (char) 961); // murdaja layanna
		put((char)0x0DC6, "" + (char) 943); // fhayanna
		
		 // HalKura
		put((char)0x0DCA, "" + (char) 998);
		
		//Depending Vowels
		put((char)0x0DCF, "" + (char) 1001); //ala pilla
		put((char)0x0DD0, "" + (char) 1002); //keti ada pilla
		put((char)0x0DD1, "" + (char) 970); //diga ala pilla
		put((char)0x0DD2, "" + (char) 1016); //keti is pilla
		put((char)0x0DD3, "" + (char) 984); //diga is pilla
		put((char)0x0DD4, "" + (char) 1014); //keti paa pilla
		put((char)0x0DD6, "" + (char) 982); //diga paa pilla
		put((char)0x0DD8, "" + (char) 969); //gata pilla
		put((char)0x0DD9, "" + (char) 1003); //kombuwa
		put((char)0x0DDB, "" + (char) 1003 + (char) 1003); //kombu deka
		put((char)0x0DDF, "" + (char) 934); //gayanukitta
		put((char)0x0DF2, "" + (char) 969 + (char) 969); //diga gatapili deka
		put((char)0x0DF3, ""); //diga gayanukitta
		
		//FUNCTUATION
		put((char)0x0DF4, ""); //KUNDDALIYA
		
	}
}
