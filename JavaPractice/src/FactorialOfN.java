/*
* File: TemperatureConversionTable.java
* -------------------------------------
* This program returns the factorial of a user-specified
* integer.
*/

import acm.program.*;

public class FactorialOfN extends ConsoleProgram {

	public void run() {
		println("This program returns the factorial of an integer.");
		int n = readInt("Enter an integer: ");
		println("n! = " + factorial(n));
	}
	
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
		result *= i;
		}
		return result;
		}
}
