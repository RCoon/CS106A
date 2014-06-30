/*
* File: SignTest.java
* -------------------
* This program reads in an integer and classifies it as negative,
* zero, or positive depending on its sign.
*/

import acm.program.*;

public class SignTest extends ConsoleProgram {
	public void run() {
		println("This program classifies an integer by its sign.");
		int n = readInt("Enter n: ");
		if (n > 0) {
			println("That number is positive.");
		} else if (n == 0) {
			println("That number is zero.");
		} else {
			println("That number is negative.");
		}
	}
}