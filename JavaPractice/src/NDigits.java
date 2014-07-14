/*
 *  File: NDigits.java
 *  ------------------
 *  This program returns the number of digits
 *  in the integer n.
 */

import acm.program.*;

// Returns the number of digits in the integer n
public class NDigits extends ConsoleProgram {

	// Runs the program	
	public void run() {
		println("This program returns the number of digits" +
		" in the integer n.");
		int n = readInt("Enter n: ");
		println("The number of digits in n is " + nDigits(n));
	}
	
	
	private int nDigits(int n) {
		int dcount = 0;
		while (n > 0) {
			dcount++;
			n /= 10;
		}
		return dcount;
	}
}
