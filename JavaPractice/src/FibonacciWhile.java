/*
* File: Fibonacci.java
* --------------------
* This program displays the values of the Fibonacci
* sequence from F0 through F15.
*/

import acm.program.*;

public class FibonacciWhile extends ConsoleProgram {
	private static final int FIB_MAX = 10000;
	
	public void run() {
		int fib1 = 0;
		int fib2 = 1;
		println(fib1);
		while (fib2 < FIB_MAX) {
			int saveFib1 = fib1;
			fib1 = fib2;
			fib2 = saveFib1 + fib2;
			println(fib1);
		}
	}

}
