package net.jnotes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class JNotes{

	public static void main(String[] args) throws IOException {
		Tone t = new Tone();
		LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("tune.txt")));
		lnr.skip(Long.MAX_VALUE);
		System.out.println(lnr.getLineNumber());

		TuneParser tp = new TuneParser();
		Scanner sc = new Scanner(new File("tune.txt"));
		t.progChange(sc.nextInt());
		for(int i = 1; i <= lnr.getLineNumber(); i++){
			String note = sc.nextLine();
			System.out.println(note.length());
			for(int j = 4; j <= 24; j += 4){
				if(note.length() == j){
					int[] noteNo = new int[j / 4];
					int[] delta = new int[j / 4];
					for(int k = 0; k < noteNo.length; k++){
						noteNo[k] = tp.decodeNote(note.substring(k * 4, k * 4 + 4));
						delta[k] = tp.decodeDuration(note.substring(k * 4 + 2, k * 4 + 3));
						t.noteOn(0, noteNo[k], 127);
					}
					t.noteOff(delta[0], noteNo[0]);
					for(int k = 1; k < noteNo.length; k++){
						t.noteOff(0, noteNo[k]);
					}
				}
			}
		}
		t.writeToFile("tune.mid");
		try {
			t.play("tune.mid");
		} catch (MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace(); // TODO: Actually handle errors.
		}
		lnr.close();
		sc.close();
	}

}
