/*
 * File: WordPalindrone.java
 * -------------------------
 * This program uses the method isPalindrone to test if a word is a palindrone.
 */

import acm.program.*;

public class WordPalindrone extends ConsoleProgram {
	
	public void run() {
		String str = readLine("Enter a word and I'll tell you if it's a palindrone: ");
		if (isPalindrone(str)) {
			println(str + " is a palindrone.");
		} else {
			println(str + " is not a palindrone.");
		}
	}

	private boolean isPalindrone(String str) {
		String test = str;
		int length = test.length();
		for (int i = 0; i < length / 2; i++) {
			if (test.charAt(i) != test.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
}
