/*
* File: AverageListStringSentinel.java
* -------------------------
* This program reads integers one per line until the
* user enters a special sentinel value to signal the
* end of the input. At that point, the program
* prints out the average of the numbers entered so far.
*/

import acm.program.*;
import java.text.DecimalFormat;

public class AverageListStringSentinel extends ConsoleProgram {
	// Specifies the value of the sentinel
	private static final String SENTINEL = "";
	
	public void run() {
		println("This program averages a list of integers.");
		println("Enter values, one per line, using a blank line to signal the end of the list.");
		int total = 0;
		int count = 0;
		while (true) {
			String value = readLine("Enter an integer: ");
			if (value.equals(SENTINEL)) break;
			int decValue = Integer.parseInt(value);
			total += decValue;
			count++;
		}
		double average = (double)total / count;
		DecimalFormat df = new DecimalFormat("##.#");
		average = Double.valueOf(df.format(average));
		println("The average is " + average + ".");
	}
}