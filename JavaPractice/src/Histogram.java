/* File: Histogram.java
 * --------------------
 * This program reads in an array of integers and displays a histogram
 * divided into ranges.
 */

import acm.program.*;

public class Histogram extends ConsoleProgram {
	
	public void run() {
		int numValues = readInt("How many data values do you have? ");
		int[] intArray = new int[numValues];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = readInt("Enter a value: ");
			if (intArray[i] < 10) {
				ones++;
			} else if (intArray[i] < 20) {
				tens++;
			} else if (intArray[i] < 30) {
				twenties++;
			} else if (intArray[i] < 40) {
				thirties++;
			} else if (intArray[i] < 50) {
				forties++;
			} else if (intArray[i] < 60) {
				fifties++;
			} else if (intArray[i] < 70) {
				sixties++;
			} else if (intArray[i] < 80) {
				seventies++;
			} else if (intArray[i] < 90) {
				eighties++;
			} else if (intArray[i] < 100) {
				nineties++;
			} else {
				hundreds++;
			}
		}
			println("0-9    |  " + printAsterisks(ones));
			println("10-19  |  " + printAsterisks(tens));
			println("20-29  |  " + printAsterisks(twenties));
			println("30-39  |  " + printAsterisks(thirties));
			println("40-49  |  " + printAsterisks(forties));
			println("50-59  |  " + printAsterisks(fifties));
			println("60-69  |  " + printAsterisks(sixties));
			println("70-79  |  " + printAsterisks(seventies));
			println("80-89  |  " + printAsterisks(eighties));
			println("90-99  |  " + printAsterisks(nineties));
			println("100    |  " + printAsterisks(hundreds));
	}
	
	private String printAsterisks(int i) {
		String asterisks = "";
		for (int j = 0; j < i; j++) {
			asterisks += "*";
		}
		return asterisks;
	}

	private int ones, tens, twenties, thirties, forties, fifties, sixties, seventies, eighties, nineties, hundreds = 0;
	
}