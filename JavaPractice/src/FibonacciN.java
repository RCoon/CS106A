/*
* File: Fibonacci.java
* --------------------
* This program displays the values of the Fibonacci
* sequence from F0 through F15.
*/

import acm.program.*;

public class FibonacciN extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n to calculate the nth Fibonacci number: ");
		String num = "";
		if (n == 1) {
			num = "st";
		} else if (n == 2) {
			num = "nd";
		} else if (n == 3) {
			num = "rd";
		} else {
			num = "th";
		}
		
		println("The " + n + num + " Fibonacci number is " + fibonacci(n));
	}
	private int fibonacci(int n) {
		int fib1 = 0;
		int fib2 = 1;
		int count = 2;
		for(int i = 0; i <= n - count; i++) {
			int saveFib1 = fib1;
			fib1 = fib2;
			fib2 = saveFib1 + fib2;
		}
		return fib1;
	}
}
