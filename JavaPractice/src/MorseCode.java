/*
 * File: MorseCode.java
 * --------------------
 * This program reads in a string from the user and translates
 * each letter to its equivalent in Morse code.
 */

import acm.program.*;
import java.util.StringTokenizer;

public class MorseCode extends ConsoleProgram {
	
/** Runs the program */
	public void run() {
		// Separates string into tokens (delimited by spaces), prints each token on a new line
		println("This program translates a line into Morse code.");
		String userString = readLine("Enter English text: ");
		StringTokenizer tokenizer = new StringTokenizer(userString);
		while (tokenizer.hasMoreTokens()) {
			println(replaceLetter(tokenizer.nextToken()));
		}
	}

/** Converts the string to uppercase and returns the Morse code version */
	private String replaceLetter(String str) {
		str = str.toUpperCase();
		String result = "";
		int index = 0;
		// For each character that's a letter, get its position in the alphabet by subtracting the char 'A' from it
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				index = (int) ch - 'A';
				result += morseCode[index] + " ";
			}
		}
		return result;
	}
	
	String[] morseCode = {
			".-", //A
			"-...", //B
			"-.-.", //C
			"-..", //D
			".", //E
			"..-.", //F
			"--.", //G
			"....", //H
			"..", //I
			".---", //J
			"-.-", //K
			".-..", //L
			"--", //M
			"-.", //N
			"---", //O
			".--.", //P
			"--.-", //Q
			".-.", //R
			"...", //S
			"-", //T
			"..-", //U
			"...-", //V
			".--", //W
			"-..-", //X
			"-.--", //Y
			"--.."
	};
	
}