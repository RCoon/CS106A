/*
 * File: Consonants.java
 * ---------------------
 * This program prints out the English consonants.
 */

import acm.program.*;

public class Consonants extends ConsoleProgram {
	
	public void run() {
		printUpperCaseConsonants();
	}

	private boolean isEnglishConsonant(char ch) {
		char letter = Character.toLowerCase(ch);
		if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
			return true;
		} else {
			return false;
		}
	}
	
	private char printUpperCaseConsonants() {
		char test = 'A';
		for (int i = 0; i < 26; i++) {
			if (isEnglishConsonant(test)) {
				println(test);
			}
			test++;
		}
		return test;
	}
}
