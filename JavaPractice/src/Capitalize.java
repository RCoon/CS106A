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
		String test = "this";
		capitalize(test);
	}

	private String capitalize(String str) {
		String result = str.substring(0, 1);
		return result;
	}
	
}
