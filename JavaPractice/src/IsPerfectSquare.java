/*
 *  File: IsPerfectSquare.java
 *  --------------------------
 *  This program includes a method that returns
 *  true if the integer n is a perfect square.
 */

import acm.program.*;

public class IsPerfectSquare extends ConsoleProgram {

	public void run() {
		int num = readInt("Enter an integer: ");
		if (isPerfectSquare(num)) {
			println(num + " is a perfect square.");
		} else {
			println(num + " is not a perfect square.");
		}
	}
	
	private boolean isPerfectSquare(int n) {
		return ((int)(Math.sqrt(n)) * (int)(Math.sqrt(n)) == n);
	}
}
