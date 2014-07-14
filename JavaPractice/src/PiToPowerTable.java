/*
 *  File: PiToPowerTable.java
 *  -------------------------
 *  This file generates a table of pi raised to
 *  the powers of -4 through 4.
 */

import acm.program.*;

public class PiToPowerTable extends ConsoleProgram {
	
// Lower limit for the table
	private static final int LOWER_LIMIT = -4;
	
// Upper limit for the table
	private static final int UPPER_LIMIT = 4;
	
// Runs the program
	public void run() {
		for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
			println("PI ^ " + i + " = " + raiseRealToPower(Math.PI, i));
		}
	}
	
	private double raiseRealToPower(double x, int k) {
		double result;
		if (k < 0) {
			result = (1 / (Math.pow(x, -k)));
		} else {
			result = Math.pow(x, k);
		}
		return result;
	}
}
