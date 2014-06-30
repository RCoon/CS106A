/*
* File: LeapYear.java
* -------------------
* This program reads in a year and determines whether it is a
* leap year. A year is a leap year if it is divisible by four,
* unless it is divisible by 100. Years divisible by 100 are
* leap years only if divisible by 400.
*/

import acm.program.*;

public class LeapYear extends ConsoleProgram {
	public void run() {
		println("This program checks for leap years.");
		int year = readInt("Enter year: ");
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0))
				|| (year % 400 == 0);
		if (isLeapYear) {
			println(year + " is a leap year.");
		} else {
			println(year + " is not a leap year.");
		}
	}
}