/*
* File: FeetAndInchesToCentimeters.java
* ------------------------------
* This program converts feet and inches to centimeters.
*/

import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram {
	public void run() {
		println("This program converts feet and inches to centimeters.");
		int feet = readInt("Enter number of feet: ");
		int inches = readInt("Enter number of inches: ");
		double cm = Math.round(((feet * 12) + inches) * CENTIMETERS_PER_INCH);
		println(feet + "ft " + inches + "in = " + cm + "cm");
	}
	private static final double CENTIMETERS_PER_INCH = 2.54;
}