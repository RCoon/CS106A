/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {

/** Resets the display so that only the scaffold appears */
	public void reset() {
		removeAll();
		drawScaffold();
		drawHangman();
	}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		remove(dashedWord);
		dashedWord.setLabel(word);
		dashedWord.setFont("Courier-36");
		add(dashedWord, getWidth() * 0.1, getHeight() * 0.8);
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter) {
		remove(incorrectLetters);
		setNextVisible();
		guessedLetters += letter;
		incorrectLetters.setLabel(guessedLetters);
		incorrectLetters.setFont("Courier-24");
		add(incorrectLetters, getWidth() * 0.1, getHeight() * 0.9);
	}
	
	private void setNextVisible() {
		switch (incorrectGuessCount) {
		case 0: hangman.add(head); incorrectGuessCount++; break;
		case 1: hangman.add(body); incorrectGuessCount++; break;
		case 2: hangman.add(leftUpperArm); hangman.add(leftLowerArm); incorrectGuessCount++; break;
		case 3: hangman.add(rightUpperArm); hangman.add(rightLowerArm); incorrectGuessCount++; break;
		case 4: hangman.add(hips); hangman.add(leftLeg); incorrectGuessCount++; break;
		case 5: hangman.add(rightLeg); incorrectGuessCount++; break;
		case 6: hangman.add(leftFoot); incorrectGuessCount++; break;
		default: hangman.add(rightFoot); incorrectGuessCount++; break;
		}
		
	}
	
	private GCompound drawScaffold() {
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		int x1 = x - BEAM_LENGTH;
		int y1 = y + LEG_LENGTH;
		scaffold = new GCompound();
		vertScaffold = new GLine(x1, y1, x1, y1 - SCAFFOLD_HEIGHT);
		scaffold.add(vertScaffold);
		horizScaffold = new GLine(x1, y1 - SCAFFOLD_HEIGHT, x, y1 - SCAFFOLD_HEIGHT);
		scaffold.add(horizScaffold);
		rope = new GLine(x, y1 - SCAFFOLD_HEIGHT, x, y1 - SCAFFOLD_HEIGHT + ROPE_LENGTH);
		scaffold.add(rope);
		add(scaffold);
		return scaffold;
	}
	
	private GCompound drawHangman() {
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		int y1 = y + LEG_LENGTH;
		int ybody = y1 - SCAFFOLD_HEIGHT + ROPE_LENGTH + HEAD_RADIUS;
		int yarm = ybody + ARM_OFFSET_FROM_HEAD;
		int yleg = ybody + BODY_LENGTH + LEG_LENGTH;
		hangman = new GCompound();
		head = new GOval(x - HEAD_RADIUS / 2, y1 - SCAFFOLD_HEIGHT + ROPE_LENGTH, HEAD_RADIUS, HEAD_RADIUS);
		body = new GLine(x, ybody, x, ybody + BODY_LENGTH);
		leftUpperArm = new GLine(x, yarm, x + UPPER_ARM_LENGTH, yarm);
		rightUpperArm = new GLine(x, yarm, x - UPPER_ARM_LENGTH, yarm);
		leftLowerArm = new GLine(x + UPPER_ARM_LENGTH, yarm, x + UPPER_ARM_LENGTH, yarm + LOWER_ARM_LENGTH);
		rightLowerArm = new GLine(x - UPPER_ARM_LENGTH, yarm, x - UPPER_ARM_LENGTH, yarm + LOWER_ARM_LENGTH);
		hips = new GLine(x - HIP_WIDTH / 2, ybody + BODY_LENGTH, x + HIP_WIDTH / 2, ybody + BODY_LENGTH);
		leftLeg = new GLine(x + HIP_WIDTH / 2, ybody + BODY_LENGTH, x + HIP_WIDTH / 2, yleg);
		rightLeg = new GLine(x - HIP_WIDTH / 2, ybody + BODY_LENGTH, x - HIP_WIDTH / 2, yleg);
		leftFoot = new GLine(x + HIP_WIDTH / 2, yleg, x + HIP_WIDTH / 2 + FOOT_LENGTH, yleg);
		rightFoot = new GLine(x - HIP_WIDTH / 2, yleg, x - HIP_WIDTH / 2 - FOOT_LENGTH, yleg);
		add(hangman);
		return hangman;
	}

/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 42;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 60;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 48;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

// Instance variables	
	private GLine vertScaffold, horizScaffold, rope, body, leftUpperArm, rightUpperArm;
    private GLine leftLowerArm, rightLowerArm, hips, leftLeg, rightLeg, leftFoot, rightFoot;
    private GOval head;
    private GCompound scaffold, hangman;
    private GLabel dashedWord = new GLabel(""); 
    private GLabel incorrectLetters = new GLabel("");
    private int incorrectGuessCount = 0;
    private String guessedLetters = "";
}