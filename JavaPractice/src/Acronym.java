/*
 * File: Acronym.java
 * ------------------
 * This program prompts the user for an string and
 * returns an acronym of the string.
 */

import acm.program.*;

public class Acronym extends ConsoleProgram {
	
	public void run() {
		String string = readLine("Enter a sentence: ");
		println("The acronym is " + acronym(string));
	}

	public String acronym(String str) {
		String result = str.substring(0, 1);
		int pos = str.indexOf(' ');
		while (pos != -1) {
			result += str.substring(pos + 1, pos + 2);
			pos = str.indexOf(' ', pos + 1);
		}
		return result;
	}
}

