package net.jnotes;

import java.util.regex.*;
import java.util.*;

public class TuneParser {
	private static final Map<String, Integer> noteMap = new HashMap<String, Integer>();
	private static final Map<String, Integer> sharpnessMap = new HashMap<String, Integer>();
	public TuneParser() {
		noteMap.put("c",0);
		noteMap.put("d",2);
		noteMap.put("e",4);
		noteMap.put("f",5);
		noteMap.put("g",7);
		noteMap.put("a",9);
		noteMap.put("b",11);
		
		sharpnessMap.put("c",1);
		sharpnessMap.put("d",1);
		sharpnessMap.put("e",0);
		sharpnessMap.put("f",1);
		sharpnessMap.put("g",1);
		sharpnessMap.put("a",1);
		sharpnessMap.put("b",0);
	}
	
	public static int decodeNote(String note){	
		note = note.toLowerCase();
		Pattern pattern = Pattern.compile("([cdefgab])(\\d{1,2})([dsqcmb])([+-])");
		Matcher matcher = pattern.matcher(note);
		if(matcher.matches()) {
			String baseNote = matcher.group(1);
			int octave = Integer.parseInt(matcher.group(2));
			boolean isSharp = matcher.group(4).equals("+");
			
			return noteMap.get(baseNote) + 12*octave + (isSharp?sharpnessMap.get(baseNote):0);
		} else {
			System.out.println("Parsing error: Check 'tune.txt'");
			return -1;
		}
	}
	
	public int decodeDuration(String duration){
		
		int decode = 0;
		
		switch(duration){
			
			case "D":
				return 2;
		
			case "S":
				return 4;
			
			case "Q":
				return 8;
				
			case "C":
				return 16;
				
			case "M":
				return 32;
				
			case "B":
				return 64;
		
		}
		
		return decode;
		
	}	
}
