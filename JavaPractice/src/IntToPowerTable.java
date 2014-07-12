/*
 *  File: IntToPowerTable.java
 *  -------------------------
 *  This file generates a table of values of n raised to
 *  the powers of 0 through 10.
 */

import acm.program.*;

public class IntToPowerTable extends ConsoleProgram {

// Lower limit for the table
	private static final int LOWER_LIMIT = 0;
	
// Upper limit for the table
	private static final int UPPER_LIMIT = 10;

// Runs the program
	public void run() {
		int n = readInt("Enter n: ");
		for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
				println(n + " ^ " + i + " = " + raiseIntToPower(n, i));
		}
	}
	
	private int raiseIntToPower(int n, int k) {
		return (int) Math.pow(n, k);
	}
}
