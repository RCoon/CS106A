/*
 * File: ScrabbleWordScore.java
 * ----------------------------
 * This program reads in words and prints out their
 * score in Scrabble.  Any characters other than
 * uppercase letters are ignored, lowercase letters
 * are assumed to represent blank tiles with no score.
 */

import acm.program.*;

public class ScrabbleWordScore extends ConsoleProgram {
	
	public void run() {
		String word = readLine("Enter a word in Scrabble: ");
		int score = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			score += scrabbleScore(ch);
		}
		println("The word \"" + word + "\" is worth " + score + " point" + (score == 1 ? "" : "s") + " in Scrabble.");
	}
	
	private int scrabbleScore(char ch) {
		char letter = ch;
		if (letter < 'A' || letter > 'Z') {
			return 0;
		} else if (letter == 'A' || letter == 'E' || letter == 'I' ||
				letter == 'L' || letter == 'N' || letter == 'O' ||
				letter == 'R' || letter == 'S' || letter == 'T' ||
				letter == 'U') {
			return 1;
		} else if (letter == 'D' || letter == 'G') {
			return 2;
		} else if (letter == 'B' || letter == 'C' || letter == 'M' ||
				letter == 'P') {
			return 3;
		} else if (letter == 'F' || letter == 'H' || letter == 'V' ||
				letter == 'W' || letter == 'W' || letter == 'Y') {
			return 4;
		} else if (letter == 'K') {
			return 5;
		} else if (letter == 'J' || letter == 'X') {
			return 8;
		} else if (letter == 'Q' || letter == 'Z') {
			return 10;
		} else {
			return 0;
		}
	}
}