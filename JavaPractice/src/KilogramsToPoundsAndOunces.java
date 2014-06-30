/*
* File: KilogramsToPoundsAndOunces.java
* ------------------------------
* This program converts kilograms to pounds and ounces.
*/

import acm.program.*;
import java.text.DecimalFormat;

public class KilogramsToPoundsAndOunces extends ConsoleProgram {
	public void run() {
		println("This program converts kilograms to pounds and ounces.");
		double kilos = readDouble("Enter weight in kilograms: ");
		double pounds = kilos * 2.2;
		double ounces = (pounds % 1) * 16;
		DecimalFormat df = new DecimalFormat("#.##");
		ounces = Double.valueOf(df.format(ounces));
		println("The weight is " + (int)pounds + " pounds and " + ounces + " ounces.");
	}
}