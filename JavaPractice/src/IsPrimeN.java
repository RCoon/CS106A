/*
 *  File: IsPrimeN.java
 *  -------------------
 *  This program includes a method that returns true if
 *  integer n is a prime number.
 */

import acm.program.*;

public class IsPrimeN extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter an integer: ");
		if (isPrime(n)) {
			println(n + " is a prime number.");
		} else {
			println(n + " is not a prime number.");
		}
	}
	
	private boolean isPrime(int n) {
		int test = n - 1;
		while (n % test != 0) {
			test--;
		}
		if (test == 1) {
			return true;
		} else {
			println(test + " is a divisor of " + n + ".");
			return false;
		}
	}
}