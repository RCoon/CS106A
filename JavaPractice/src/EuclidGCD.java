/*
 *  File: EuclidGCD.java
 *  --------------------
 *  This program uses Euclid's algorithm to calculate
 *  the greatest common denominator of x and y.
 */

import acm.program.*;

public class EuclidGCD extends ConsoleProgram {

	// Runs the program
	public void run() {
		int x = readInt("Enter an integer x: ");
		int y = readInt("Enter an integer y: ");
		println("The gcd of " + x + " and " + y + " is: " + gcd(x, y));
	}
	
	// Returns the gcd of x and y
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
}
