/*
 * File: MagicSquare.java
 * ----------------------
 * This program tests the method isMagicSquare to see if a multi-dimensional
 * array contains a magic square.
 */

import acm.program.*;
import acm.util.*;

public class MagicSquare extends ConsoleProgram {
	
	public void run() {
		println("This program generates a square array, prints it, and tests if it is a magic square.");
		int sizeOfSquare = readInt("How many rows do you want in your square? ");
		int[][] array = initSquareArray(sizeOfSquare);
		displaySquareArray(array);
		if (isMagicSquare(array)) {
			println("This is a magic square.");
		} else {
			println("This is not a magic square.");
		}
	}

	private int[][] initSquareArray(int size) {
		int[][] square = new int[size][size];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				square[row][col] = 5;
				// rgen.nextInt(1, 9);
			}
		}
		return square;
	}
	
	private void displaySquareArray(int array[][]) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				print(array[row][col]);
				print(" ");
			}
			println("");
		}
	}	
	
	private boolean isMagicSquare(int array[][]) {
		int horizSum = 0, vertSum = 0, leftDownDiagSum = 0, rightDownDiagSum = 0;
		int nextHorizSum = 0;
		for (int col = 0; col < array.length; col++) {
			horizSum += array[0][col];
		}
		for (int row = 0; row < array.length; row++) {
			nextHorizSum = 0;
			for (int col = 0; col < array.length; col++) {
				nextHorizSum += array[row][col];
			}
			if (horizSum != nextHorizSum) {
				return false;
			}
		}
		return true;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
