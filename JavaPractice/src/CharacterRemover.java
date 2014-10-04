/*
 * File: CharacterRemover.java
 * ---------------------------
 * This program implements the method removeAllOccurrences(String str, char ch)
 * that removes all occurrences of the character ch from the String str.
 */

import acm.program.*;

public class CharacterRemover extends ConsoleProgram {
	
	public void run() {
		println("This program removes all occurrences of a character from a String.");
		String str = readLine("Enter a string: ");
		String strCh = readLine("Enter a character that you want removed from the String: ");
		char ch = strCh.charAt(0);
		println(removeAllOccurrences(str, ch));
	}
	
	private String removeAllOccurrences(String str, char ch) { 
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}