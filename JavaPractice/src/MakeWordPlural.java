/*
 * File: MakeWordPlural.java
 * -------------------------
 * This program test the method regularPluralForm(word) that
 * returns the plural of (word) formed by these standard
 * English rules: 
 * a. If the word ends in s, x, z, ch, or sh, add es to the word.
 * b. If the word ends in y and the y is preceded by a consonant, change the y to ies.
 * c. In all other cases, add just an s.
 */

import acm.program.*;

public class MakeWordPlural extends ConsoleProgram {
	
	public void run() {
		String word = readLine("Enter a word and I'll give you the plural form: ");
		println(regularPluralForm(word));
	}

	private String regularPluralForm(String word) {
		String makePlural = word;
		int length = makePlural.length();
		if (makePlural.charAt(length - 1) == 's' || makePlural.charAt(length - 1) == 'x' ||
				makePlural.charAt(length - 1) == 'z' || makePlural.substring(length - 2).equals("ch") ||
				makePlural.substring(length - 2).equals("sh")) {
			makePlural += "es";
		} else if (makePlural.charAt(length - 1) == 'y' && isEnglishConsonant(makePlural.charAt(length - 2))) {
			makePlural = makePlural.substring(0, length - 1) + "ies";
		} else {
			makePlural += "s";
		}
	return makePlural;
	}
	
	private boolean isEnglishConsonant(char ch) {
		char letter = Character.toLowerCase(ch);
		if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
			return true;
		} else {
			return false;
		}
	}
}
