/*
* File: ReverseDigitsRecursion.java
* -------------------
* This program reverses the digits in a positive integer.
* The program depends on the fact that the last digit of
* a integer n is given by n % 10 and the number consisting
* of all but the last digit is given by the expression n / 10.
*/

// THIS IS NOT ACTUALLY WORKING YET...

import acm.program.*;

public class ReverseDigitsRecursion extends ConsoleProgram {
	// int n = 0;
	public void run() {
		println("This program reverses the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		reverse(n);
	}
	
	private static int reverse(int n, int r) {
	    if (n == 0) return r;
	    return reverse(n/10, 10*r+n%10);
	}
	public static int reverse(int n) {
	    return reverse(n, 0);
	}
}
