/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class Hangman extends ConsoleProgram {

	private static final int NUM_GUESSES = 8;
	
	public void init() {
		canvas = new HangmanCanvas();
		add(canvas);
		
	}
	
	public void run() {
		canvas.reset();
		lex = new HangmanLexicon();
		currentWord = chooseWord();
		String dashedWord = changeCharToDash(currentWord);
		guessesLeft = NUM_GUESSES;
		String guess = "";
		char charGuess;
		println("Welcome to Hangman!");
		while (guessesLeft > 0) {
			if (dashedWord.indexOf("-") == -1) {
				canvas.displayWord(dashedWord);
				println("You guessed the word: " + currentWord);
				println("You win.");
				break;
			}
			println("The word now looks like this: " + dashedWord);
			canvas.displayWord(dashedWord);
			if (guessesLeft == 1) {
				println("You have only one guess left.");
			} else {
			println("You have " + guessesLeft + " guesses left.");
			}
			guess = readLine("Your guess: ");
			while (guessValidator(guess) == null) {
				println("That guess is illegal.");
				guess = readLine("Your guess: ");
			} 
			charGuess = strGuessToChar(guess);
			if (currentWord.indexOf(charGuess) == -1) {
				println("There are no " + charGuess + "\'s in the word.");
				guessesLeft--;
				canvas.noteIncorrectGuess(charGuess);
			} else {
				for (int i = 0; i < currentWord.length(); i++) {
					if (charGuess == currentWord.charAt(i)) {
						dashedWord = changeDashToChar(dashedWord, charGuess, i);
					}
				}
				println("That guess is correct.");
			}
		}
		if (guessesLeft == 0) {
			println("You're completely hung.");
			println("The word was: " + currentWord);
			println("You lose.");
		}
	}
    
    private String chooseWord() {
    	int numWords = lex.getWordCount();
    	String chosenWord = lex.getWord(rgen.nextInt(0, numWords - 1));
    	return chosenWord;
    }
    
    private String changeCharToDash(String str) {
    	String result = "";
    	for (int i = 0; i < str.length(); i++) {
    		result += "-";
    	}
    	return result;
    }
    
    private String changeDashToChar(String str, char ch, int index) {
    	String result = "";
    	for (int i = 0; i < str.length(); i++) {
    		if (index != i) {
    			result += str.charAt(i);
    		} else {
    			result += ch;
    		}
    	}
    	return result;
    }
    
    private String guessValidator(String str) {
    	if (str.equals(null) || str.equals("")) {
    		return null;
    	}
    	String userGuess = str.toUpperCase();
    	if (userGuess.length() > 1) {
    		return null;
    	} else if (!Character.isLetter(userGuess.charAt(0))) {
    		return null;
    	} else {
    		return userGuess;
    	}
    }
    
    private char strGuessToChar(String str) {
    	char charGuess = Character.toUpperCase(str.charAt(0));
    	return charGuess;
    }
    
// Instance variables
    private HangmanLexicon lex;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private String currentWord;
    private int guessesLeft;
    private HangmanCanvas canvas;
}