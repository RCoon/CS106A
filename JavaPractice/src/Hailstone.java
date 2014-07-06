/*
 * File: Hailstone.java
 * --------------------
 * This program computes the Hailstone sequence for an integer.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
	    int count = 0; // counter for steps taken to reach 1
	    int n = readInt("Enter a number: ");
		while (n != 1) {
			if (n % 2 == 0) {
				println(n + " is even so I take half: " + (n / 2));
				n = (n / 2);
			} else {
				println(n + " is odd, so I make 3n + 1: " + (3 * n + 1));
				n = (3 * n + 1);
			}
			count++;
		}
	println("The process took " + count + " to reach 1");	
	}
}