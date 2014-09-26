/*
 * File: PresentParticiple.java
 * ----------------------------
 * This program test the method presentParticiple(verb) that
 * takes a verb and creates the present participle.
 */

import acm.program.*;

public class PresentParticiple extends ConsoleProgram {
	
	public void run() {
		String verb = readLine("Enter a verb and I'll print it's present progressive tense: ");
		println(presentParticiple(verb));
	}

	private String presentParticiple(String verb) {
		String presParticiple = verb;
		int length = presParticiple.length();
		if (presParticiple.charAt(length - 1) == 'e' && 
				isEnglishConsonant(presParticiple.charAt(length - 2))) {
			presParticiple = presParticiple.substring(0, length - 1) + "ing";
		} else if (presParticiple.charAt(length - 1) == 'e' && 
				!isEnglishConsonant(presParticiple.charAt(length - 2))) {
			presParticiple += "ing";
		} else if (isEnglishConsonant(presParticiple.charAt(length - 1)) && 
				!isEnglishConsonant(presParticiple.charAt(length - 2))) {
			presParticiple = presParticiple + presParticiple.charAt(length - 1) + "ing";
		} else if (isEnglishConsonant(presParticiple.charAt(length - 1)) && 
				isEnglishConsonant(presParticiple.charAt(length - 2))) {
			presParticiple += "ing";
		} else {
			presParticiple += "ing";
		}
		
		return presParticiple;
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
