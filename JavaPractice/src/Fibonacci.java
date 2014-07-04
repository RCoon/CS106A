/*
* File: Fibonacci.java
* --------------------
* This program displays the values of the Fibonacci
* sequence from F0 through F15.
*/

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {
		int fib1 = 0;
		int fib2 = 1;
		println(fib1);
		for(int i = 0; i < 20; i++) {
			int saveFib1 = fib1;
			fib1 = fib2;
			fib2 = saveFib1 + fib2;
			println(fib1);
		}
	}

}
