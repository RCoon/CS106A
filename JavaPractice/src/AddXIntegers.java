/*
* File: AddXIntegers.java
* -----------------------
* This program adds x integers and prints their sum.
*/

import acm.program.*;

public class AddXIntegers extends ConsoleProgram {
	public void run() {
		int total = 0;
		int numOfInts = readInt("How many integers do you want to add? ");
		println("This program will add " + numOfInts + " integers.");
		for (int i = 0; i < numOfInts; i++) {
			int value = readInt("Enter an integer: ");
			total += value;
		}
		println("The total is " + total + ".");
	}
}