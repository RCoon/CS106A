/*
* File: ReverseDigits.java
* -------------------
* This program reverses the digits in a positive integer.
* The program depends on the fact that the last digit of
* a integer n is given by n % 10 and the number consisting
* of all but the last digit is given by the expression n / 10.
*/

import acm.program.*;

public class ReverseDigits extends ConsoleProgram {
	public void run() {
		println("This program reverses the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		// println("The reversed number is ");
		// int nextNum = 0;
		int temp = 0;
		int reverse = 0;
		while (n > 0) {
			temp = n % 10;
			reverse = 10*reverse + temp;
			n/=10;
			// nextNum += n % 10;
			// print(n % 10);
			// n /= 10;
			// print(nextNum);
		}
		println("The reversed number is " + reverse);
	}
}