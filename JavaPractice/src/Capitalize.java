/*
 * File: Capitalize.java
 * ---------------------
 * This program implements and tests the capitalize() method
 *  which returns a string in which the initial character is
 *  capitalized (if it is a letter) and all other letters
 *  are converted so that they are in lowercase form.  
 *  Characters other than letters are not affected.
 */

import acm.program.*;

public class Capitalize extends ConsoleProgram {
	
	public void run() {
		String string = readLine("Enter a string: ");
		println(capitalize(string));
		
	}

	private String capitalize(String str) {
		String first = str.substring(0, 1);
		int length = str.length();
		String result = "";
		for (int i = 1; i < length; i++) {
			result += str.substring(i, i + 1);
		}
		first = first.toUpperCase();
		result = first + result;
		return result;
	}
}