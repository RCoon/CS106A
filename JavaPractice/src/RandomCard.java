/*
 * File: RandomCard.java
 * ---------------------
 * This program displays the name of a card randomly chosen from a complete
 * deck of 52 playing cards.  Each card consists of a rank and a suit.
 */

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		println("This program displays a randomly chosen card.");
		println(getRank() + " of " + getSuit());
		}
		
	private String getRank() {
		int rank = rgen.nextInt(1, 13);
		switch (rank) {
			case 1: return "Ace";
			case 2: return "2";
			case 3: return "3";
			case 4: return "4";
			case 5: return "5";
			case 6: return "6";
			case 7: return "7";
			case 8: return "8";
			case 9: return "9";
			case 10: return "10";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			default: return null;
		}
	}
		
	private String getSuit() {
		int suit = rgen.nextInt(1, 4);
		switch (suit) {
			case 1: return "Clubs";
			case 2: return "Diamonds";
			case 3: return "Hearts";
			case 4: return "Spades";
			default: return null;
		}
	}
	
// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
