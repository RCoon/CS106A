/*
 * File: SentencePalindrome.java
 * -------------------------
 * This program uses the method isSentencePalindrome to test if a sentence is a palindrome.
 */

import acm.program.*;

public class SentencePalindrome extends ConsoleProgram {
	
	public void run() {
		println("This program checks for sentence palindromes.");
		println("Indicate the end of the input with a blank line.");
		String str = readLine("Enter a string: ");
		while (str != "") {
			str = readLine("Enter a string: ");
			if (isSentencePalindrome(str)) {
				println("That string is a palindrome.");
			} else {
				println("That string is not a palindrome.");
			}
		}
	}

	private boolean isSentencePalindrome(String str) {
		String sentenceTest = str;
		int length = sentenceTest.length();
		String trimResult = "";
		for (int i = 0; i < length; i++) {
			char ch = sentenceTest.charAt(i);
			if (Character.isLetter(ch)) {
				trimResult += ch;
			}
		}
		String result = trimResult.toLowerCase();
		if (!isPalindrome(result)) {
			return false;
		}
		return true;
	}
	
	private boolean isPalindrome(String str) {
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