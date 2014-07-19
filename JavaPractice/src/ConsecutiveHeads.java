/*
 * File: ConsecutiveHeads.java
 * ---------------------------
 * This program simulates flipping a coin repeatedly
 * until 3 consecutive heads are tossed, and will
 * display the total number of coin flips made.
 */

import acm.program.*;
import acm.util.*;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run() {
		int trueCount = 0;
		int flipCount = 0;
		while (trueCount <= 2) {
			String coinFlip = rgen.nextBoolean(0.5) ? "Heads" : "Tails";
			if (coinFlip.equals("Heads")) {
				println("Heads");
				trueCount++;
			} else {
				println("Tails");
				trueCount = 0;
			}
			flipCount++;
		}
		println("It took " + flipCount + " flips to get 3 consecutive heads.");
	}
	
// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
