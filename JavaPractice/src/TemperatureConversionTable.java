/*
* File: TemperatureConversionTable.java
* -------------------------------------
* This program creates a table of Celsius to Fahrenheit
* equivalents using a function to perform the conversion.
*/

import acm.program.*;

public class TemperatureConversionTable extends ConsoleProgram {

/* Lower limit for the table */

	private static final int LOWER_LIMIT = 0;

/* Upper limit for the table */

	private static final int UPPER_LIMIT = 100;

/* Step size for the table */

	private static final int STEP_SIZE = 5;

/* Runs the program */
	public void run() {
		println("Celsius to Fahrenheit table.");
		for (int c = LOWER_LIMIT; c <= UPPER_LIMIT; c += STEP_SIZE) {
			int f = (int) celsiusToFahrenheit(c);
			println(c + "C = " + f + "F");
		}
	}
/*
 * Returns the Fahrenheit equivalent of the Celsius temperature c.
 */
	private double celsiusToFahrenheit(double c) {
		return 9.0 / 5.0 * c + 32;
	}
}