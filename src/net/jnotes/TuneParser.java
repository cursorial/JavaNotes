package net.jnotes;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TuneParser {

	private static final Pattern pattern = Pattern.compile("([cdefgab])(\\d{1,2})([dsqcmb])([+-])");
	private static final Map<String, Integer> noteMap = new HashMap<>();
	private static final Map<String, Integer> sharpnessMap = new HashMap<>();
	static {
		noteMap.put("c", 0);
		noteMap.put("d", 2);
		noteMap.put("e", 4);
		noteMap.put("f", 5);
		noteMap.put("g", 7);
		noteMap.put("a", 9);
		noteMap.put("b", 11);

		sharpnessMap.put("c", 1);
		sharpnessMap.put("d", 1);
		sharpnessMap.put("e", 0);
		sharpnessMap.put("f", 1);
		sharpnessMap.put("g", 1);
		sharpnessMap.put("a", 1);
		sharpnessMap.put("b", 0);
	}

	public int decodeNote(String note){
		note = note.toLowerCase(Locale.ENGLISH);
		Matcher matcher = pattern.matcher(note);
		if(matcher.matches()) {
			String baseNote = matcher.group(1);
			int octave = Integer.parseInt(matcher.group(2));
			boolean isSharp = matcher.group(4).equals("+");

			return noteMap.get(baseNote) + 12*octave + (isSharp?sharpnessMap.get(baseNote):0);
		}
		System.out.println("Parsing error: Check 'tune.txt'");
		return -1;
	}

	public int decodeDuration(String duration){
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
		return 0; // FIXME This type of thing should really be replaced with exception or something
	}

}
