package net.jnotes;

public class TestTuneParser {
	public static void main(String[] args) {
		String[] testData={
							"C4Q-",
							"D4Q-",
							"E4Q-",
							"F4Q-",
							"G4Q-",
							"A4Q-",
							"B4Q-",
							"C5Q-",
							"B4Q-",
							"A4Q-",
							"G4Q-",
							"F4Q-",
							"E4Q-",
							"D4Q-",
							"C4M-",
							"D4Q-",
							"E4Q-",
							"F4Q+",
							"G4Q-",
							"A4Q-",
							"B4Q-",
							"C5Q+",
							"D5Q-",
							"C5Q+",
							"B4Q-",
							"A4Q-",
							"G4Q-",
							"F4Q+",
							"E4Q-",
							"D4M-"
						};


		TuneParser tp = new TuneParser();		
		for(String s : testData) {
			if(tp.decodeNote(s) != decodeNoteOld(s)) {
				System.out.println("Error with " + s);
			}
		}
	}
	
	
	
	
	public static int decodeNoteOld(String note){
		
		int decode = 0;
		
		switch(note.substring(0, 1)){
		
			case "C":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 0;
					
					case "+":
						return 1;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 12;
					
					case "+":
						return 13;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 24;
					
					case "+":
						return 25;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 36;
					
					case "+":
						return 37;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 48;
					
					case "+":
						return 49;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 60;
					
					case "+":
						return 61;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 72;
					
					case "+":
						return 73;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 84;
					
					case "+":
						return 85;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 96;
					
					case "+":
						return 97;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 108;
					
					case "+":
						return 109;
					
					}
				
				}
				
			case "D":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 2;
					
					case "+":
						return 3;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 14;
					
					case "+":
						return 15;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 26;
					
					case "+":
						return 27;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 38;
					
					case "+":
						return 39;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 50;
					
					case "+":
						return 51;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 62;
					
					case "+":
						return 63;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 74;
					
					case "+":
						return 75;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 86;
					
					case "+":
						return 87;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 98;
					
					case "+":
						return 99;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 110;
					
					case "+":
						return 111;
					
					}
					
				}
				
			case "E":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 4;
					
					case "+":
						return 4;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 16;
					
					case "+":
						return 16;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 28;
					
					case "+":
						return 28;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 40;
					
					case "+":
						return 40;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 52;
					
					case "+":
						return 52;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 64;
					
					case "+":
						return 64;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 76;
					
					case "+":
						return 76;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 88;
					
					case "+":
						return 88;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 100;
					
					case "+":
						return 100;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 112;
					
					case "+":
						return 112;
					
					}
				
				}
				
			case "F":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 5;
					
					case "+":
						return 6;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 17;
					
					case "+":
						return 18;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 29;
					
					case "+":
						return 30;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 41;
					
					case "+":
						return 42;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 53;
					
					case "+":
						return 54;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 65;
					
					case "+":
						return 66;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 77;
					
					case "+":
						return 78;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 89;
					
					case "+":
						return 90;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 101;
					
					case "+":
						return 102;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 113;
					
					case "+":
						return 114;
					
					}
				
				}
				
			case "G":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 7;
					
					case "+":
						return 8;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 19;
					
					case "+":
						return 20;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 31;
					
					case "+":
						return 32;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 42;
					
					case "+":
						return 43;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 55;
					
					case "+":
						return 56;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 67;
					
					case "+":
						return 68;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 79;
					
					case "+":
						return 80;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 91;
					
					case "+":
						return 92;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 103;
					
					case "+":
						return 104;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 115;
					
					case "+":
						return 116;
					
					}
				
				}
			
			case "A":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 9;
					
					case "+":
						return 10;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 21;
					
					case "+":
						return 22;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 33;
					
					case "+":
						return 34;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 45;
					
					case "+":
						return 46;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 57;
					
					case "+":
						return 58;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 69;
					
					case "+":
						return 70;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 81;
					
					case "+":
						return 82;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 93;
					
					case "+":
						return 94;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 105;
					
					case "+":
						return 106;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 117;
					
					case "+":
						return 118;
					
					}
				
				}
				
			case "B":
				switch(note.substring(1, 2)){
				
				case "0":
					switch(note.substring(3, 4)){
					
					case "-":
						return 11;
					
					case "+":
						return 11;
					
					}
					
				case "1":
					switch(note.substring(3, 4)){
					
					case "-":
						return 23;
					
					case "+":
						return 23;
					
					}
					
				case "2":
					switch(note.substring(3, 4)){
					
					case "-":
						return 35;
					
					case "+":
						return 35;
					
					}
					
				case "3":
					switch(note.substring(3, 4)){
					
					case "-":
						return 47;
					
					case "+":
						return 47;
					
					}
					
				case "4":
					switch(note.substring(3, 4)){
					
					case "-":
						return 59;
					
					case "+":
						return 59;
					
					}
					
				case "5":
					switch(note.substring(3, 4)){
					
					case "-":
						return 71;
					
					case "+":
						return 71;
					
					}
					
				case "6":
					switch(note.substring(3, 4)){
					
					case "-":
						return 83;
					
					case "+":
						return 83;
					
					}
					
				case "7":
					switch(note.substring(3, 4)){
					
					case "-":
						return 95;
					
					case "+":
						return 95;
					
					}
					
				case "8":
					switch(note.substring(3, 4)){
					
					case "-":
						return 107;
					
					case "+":
						return 107;
					
					}
					
				case "9":
					switch(note.substring(3, 4)){
					
					case "-":
						return 119;
					
					case "+":
						return 119;
					
					}
				
				}
		
		}
		
		return decode;
		
	}
}
