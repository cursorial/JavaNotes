JavaNotes
=========

A musical experiment.

JavaNotes is a project I began on the evening of Wednesday 16th January 2013.

I wanted to create what could be considered a "musical programming language". I'm not entirely sure what you might call this, although a musical programming language or scripting language is the best way I can describe it.

Essentially, you enter a series of characters into a text file, and JavaNotes takes the information from the text file and processes it to create a .mid file, which then gets played by the program.

To create a tune, you must first create a .txt file called "tune.txt" the first line of the text file will specify the midi instrument you would like to use. I usually set it to 1 so I get the sound of a piano out of it. The following lines will be your notes.

To play a note, you specify the note to be played, the octave to play it on, the length of time you would like to play it for and whether it is a sharp note or not.

If I wanted to play a C Sharp on the 4th octave for one minim, I would use the following notation:

C4M+

The C is the note,
The 4 is the octave
The M is the time played,
The + indicates that it is a sharp note.
You must always declare notes in this order.

The possibilities for each of these options are as follows:

Note
====
C - play a C,
D - play a D,
E - play an E,
F - play an F,
G - play a G,
A - play an A,
B - play a B

Octave
======
0 - play on the bottom octave,
1 - play on the first octave,
2 - play on the second octave,
3 - play on the third octave,
4 - play on the fourth octave,
5 - play on the fifth octave,
6 - play on the sixth octave,
7 - play on the seventh octave,
8 - play on the eighth octave,
9 - play on the ninth octave
(There are 10 octave available in .mid, however I didn't include the 10th. I will include this later when I find a better way to parse the text from the .txt file, unless someone else can do this first)

Length
======
D - Half a semi-quaver,
S - Semi-quaver,
Q - Quaver,
C - Crotchet,
M - Minim,
B - Semi-breve
- - note is not sharp
+ - note is sharp
You can construct most notes on the .mid scale of notes using this. You can also construct chords.

To construct a chord, simply write more than one note on the same line, without any spaces, the program will parse the text file so that when it reaches the end of a line, it will move on to the next note.

A C major chord would look like this:

C4C-E4C-G4C-

It would play one C major chord on the 4th octave for one crotchet.

Currently there is no way to leave a pause between notes, although in future updates, hopefully that can be implemented.

At the end of the file, leave a blank line, this will indicate the end of the file, ensure all of your notes are entered in the correct format and that there are no blank lines or spaces that shouldn't be in the file, if all is correct, you should be able to listen to your tune.

In the files uploaded, I have included a tune.txt file that will play the intro to Sweet Child O' Mine by Guns n' Roses. When running the program, the tune.txt file should be in the same directory as the .jar file. A feature that may be added in the future will be a GUI that allows you to select .txt files to play, shouldn't be too difficult to implement.

That's essentially where we're at now, the great thing is that it also generates a .mid file for you, so you can send your .mid file to friends once you're finished with your masterpiece.
