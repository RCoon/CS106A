/*
* File: CardRank.java
* -------------------
* This program reads in an integer between 1 and 13 and
* writes out the appropriate symbol for a playing card
* of that rank.
*/

import acm.program.*;

public class CardRank extends ConsoleProgram {
	public void run() {
		println("This program converst integers to card ranks.");
		int n = readInt("Enter an integer between 1 and 13: ");
		switch (n) {
			case 1: println("Ace"); break;
			case 11: println("Jack"); break;
			case 12: println("Queen"); break;
			case 13: println("King"); break;
			default: println(n); break;
		}
	}
}