/*
 *  File: Combinations.java
 *  -----------------------
 *  This program computes the mathematical combinations function
 *  C(n, k), which is the number of ways of selecting k objects
 *  from a set of n distinct objects.
 */

import acm.program.*;

public class Combinations extends ConsoleProgram {

/* Runs the program */
	public void run() {
		int n = readInt("Enter number of objects in the set (n): ");
		int k = readInt("Enter number to be chosen (k): ");
		println("C(" + n + ", " + k + ") = " + combinations(n, k));
	}
	
/*
 *  Returns the mathematical combinations function C(n, k),
 *  which is the number of ways of selecting k objects
 *  from a set of n distinct objects.
 */
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	
/*
 *  Returns the factorial of n, which is defined as the
 *  product of all integers from 1 up to n.
 */
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
