/*
 * File: RandomWord.java
 * ---------------------
 * This program tests the method randomWord that is designed
 * to construct a "word" of randomly chosen letters and
 * randomly chosen number of letters between two constants.
 */

import acm.program.*;
import acm.util.*;

public class RandomWord extends ConsoleProgram {
	
	private static final int MIN_LETTERS = 4;
	private static final int MAX_LETTERS = 10;
	
	public void run() {
		String random = randomWord();
		println(random);
	}
	
	private String randomWord() {
		int numLetters = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		String word = "";
		for (int i = 0; i < numLetters; i++) {
			char next = randomLetter();
			word += next;
		}
		return word;
	}
	
	private char randomLetter() {
		return (char) rgen.nextInt('a', 'z');
	}
	
//Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}