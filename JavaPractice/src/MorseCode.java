/*
 * File: MorseCode.java
 * --------------------
 * This program reads in a string from the user and translates
 * each letter to its equivalent in Morse code.
 */

import acm.program.*;

public class MorseCode extends ConsoleProgram {
	
	public void run() {
		
		String userString = readLine("Enter a string to translate to Morse code: ");
		
		
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

}