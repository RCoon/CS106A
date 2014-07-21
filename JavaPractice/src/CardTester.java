/*
 * File: CardTester.java
 * ---------------------
 * This program tests the class Card to ensure proper
 * functionality.
 */

import acm.program.*;

public class CardTester extends ConsoleProgram {
	
	public void run() {
		Card card = new Card(1, 1);
		Card card2 = new Card(11, 4);
		
		println(card.getRank());
		println(card.getSuit());
		println(card.toString());
		
		println(card2.toString());
	}
}
