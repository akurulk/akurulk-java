package com.kodeincloud.akurulk;

import java.io.File;
import java.net.URL;

import android.app.Activity;
import android.graphics.Typeface;

//import android.graphics.Typeface;

public class AkuruLK {

	private final static UnicodeStablizer stablizer = new UnicodeStablizer();
	private final static StringBuffer buffer;
	
	static {
		buffer = stablizer.stabilize();
	}
	
	public final static String convert(String text) {
		
		//clean the buffer
		buffer.delete(0, buffer.length());
		
		//writing to the buffer
		stablizer.write(text).flush();
		

		///return the output
		return buffer.toString();
	}
	
	public static Typeface getFont(Activity activity) {
	
		Typeface font = Typeface.createFromAsset(activity.getAssets(), "MalithiWeb.ttf");
		return font;
	}
	
}
