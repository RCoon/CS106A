/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	// Specifies the value of the sentinel
	private static final int SENTINEL = 0;
		
	public void run() {
		println("This program finds the largest and smallest numbers.");
		int newValue = 0;
		int highValue = 0;
		int lowValue = 0;
		int total = 0;
		int count = 0;
		while (true) {
			newValue = readInt("? ");
			total += newValue;
			count++;
			if (newValue == SENTINEL) {
				break;
			} else if (newValue >= highValue) {
				highValue = newValue;
			} else if (newValue <= lowValue) {
				lowValue = newValue;
			}
		}
		if (total == SENTINEL) {
			println("No values have been entered.");
		} else if (total == highValue && count == 2) {
			println("smallest: " + highValue);
			println("largest: " + highValue);
		} else if (total == lowValue && count == 2) {
			println("smallest: " + lowValue);
			println("largest " + lowValue);
		} else {
		println("smallest: " + lowValue);
		println("largest: " + highValue);
		}
	}
}