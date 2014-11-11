/*
 * File: TicTacToe.java
 * --------------------
 * This program reads in the contents of a tic-tac-toe board array
 * and reports whether either player has won the game.
 */

import acm.program.*;

public class TicTacToe extends ConsoleProgram {
	
	public void run() {
		println("This program tests the isWinnningPosition method.");
		println("Enter the state of the board, row by row.");
		String xOrO = "";
		for (int row = 0; row < 3; row++) {
			xOrO = readLine(" ");
			for (int col = 0; col < 3; col++) {
				board[row][col] = xOrO.charAt(col);
			}
		}
		println("");
		if (isWinningPosition(board, 'X')) {
			println("X has won");
		} else if (isWinningPosition(board, 'O')) {
			println("O has won");
		} else {
			println("Neither player has won");
		}
	}
	
	private boolean isWinningPosition(char board[][], char player) {
		if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
			return true;
		} else if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
			return true;
		} else if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
			return true;
		} else if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
			return true;
		} else if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
			return true;
		} else if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
			return true;
		} else if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		} else if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		} else {
		return false;
		}
	}
	
	private void displayBoard(char[][] board) {
		for (int row = 0; row < 2; row++) {
			if (row > 0) println("-----+-----+-----");
			println(" | |");
			print(" ");
			for (int col = 0; col < 2; col++) {
				if (col > 0) print(" | ");
				print(board[row][col]);
			}
			println();
			println(" | |");
			}
	}

	private char[][] board = new char[3][3];
}
