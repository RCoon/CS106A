/*
 * File: MathQuiz.java
 * -------------------
 * This program poses a series of arithmetic problems
 * for a first or second grade student to answer.
 */

import acm.program.*;
import acm.util.*;

public class MathQuiz extends ConsoleProgram {

// Number of questions to ask
	private static final int NUM_QUESTIONS = 5;
	
// Number of additional incorrect guesses after the first question before moving on
	private static final int NUM_GUESSES = 2;
	
// Minimum integer or difference
	private static final int MIN_VALUE = 0;

// Maximum integer or sum
	private static final int MAX_VALUE = 20;
	
	public void run() {
		int studentAnswer;
		String correct = "That's the answer!";
		String incorrect = "That's incorrect - try a different answer: ";
		for (int i = 0; i < NUM_QUESTIONS; i++) {
			int guessNumber = 0;
			String operator = rgen.nextBoolean(0.5) ? "+" : "-";
			int x = rgen.nextInt(MIN_VALUE, MAX_VALUE);
			int y = rgen.nextInt(MIN_VALUE, MAX_VALUE);
			int addAnswer = x + y;
			int subAnswer = x - y;
			if (operator.equals("+")) {
				while (addAnswer > MAX_VALUE) {
					x = rgen.nextInt(MIN_VALUE, MAX_VALUE);
					y = rgen.nextInt(MIN_VALUE, MAX_VALUE);
					addAnswer = x + y;
				}
				studentAnswer = readInt("What is " + x + " + " + y + "? ");
				while (studentAnswer != addAnswer && guessNumber < NUM_GUESSES) {
					guessNumber++;
					studentAnswer = readInt(incorrect);
				}
				if (studentAnswer == addAnswer) {
					println(getAnswer());
				} else {
					println("No, the answer is " + addAnswer);
				}
			} else {
				while (subAnswer < MIN_VALUE) {
					x = rgen.nextInt(MIN_VALUE, MAX_VALUE);
					y = rgen.nextInt(MIN_VALUE, MAX_VALUE);
					subAnswer = x - y;
				}
				studentAnswer = readInt("What is " + x + " - " + y + "? ");
				while (studentAnswer != subAnswer && guessNumber < NUM_GUESSES) {
					guessNumber++;
					studentAnswer = readInt(incorrect);
				}
				if (studentAnswer == subAnswer) {
					println(getAnswer());
				} else {
					println("No, the answer is " + subAnswer);
				}
			}
		}
	}
	
	private String getAnswer() {
		int response = rgen.nextInt(0, 3);
		switch (response) {
			case 0: return "That's correct";
			case 1: return "You got it!";
			case 2: return "Way to go!";
			case 3: return "Correct!";
			default: return null;
		}
	}
// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
