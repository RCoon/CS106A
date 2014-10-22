/*
 * File: Checkers.java
 * -------------------
 * This program implements methods initCheckerboard and
 * displayCheckerboard.
 */

import acm.program.*;

public class Checkers extends ConsoleProgram {
	
	public void run() {
		setFont("Courier-24");
		displayCheckerboard(initCheckerboard());
	}

	private char[][] initCheckerboard() {
		char[][] board = new char[8][8];
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				if (row % 2 == 0 && col % 2 == 0) {
					board[row][col] = ' ';
				} else if (row % 2 != 0 && col % 2 != 0) {
					board[row][col] = ' ';
				} else if (row < 3 && row % 2 == 0 && col % 2 != 0) {
					board[row][col] = 'b';
				} else if (row == 1 && col % 2 == 0) {
					board[row][col] = 'b';
				} else if (row == 3 && col % 2 == 0) {
					board[row][col] = '-';
				} else if (row == 4 && col % 2 != 0) {
					board[row][col] = '-';
				} else if (row != 6 && col % 2 == 0) {
					board[row][col] = 'r';
				} else if (row == 6 && col % 2 != 0) {
					board[row][col] = 'r';
				}
			}
		}
		return board;
	}
	
	private void displayCheckerboard(char board[][]) {
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				print(board[row][col]);
				print("  ");
				
			}
			println("");
		}
	}	
}