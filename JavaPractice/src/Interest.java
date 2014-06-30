/*
* File: Interest.java
* ------------------------------
* This program calculates interest over 2 years.
*/

import acm.program.*;
import java.text.DecimalFormat;

public class Interest extends ConsoleProgram {
	public void run() {
		println("Interest calculation program");
		double balance = readDouble("Enter starting balance: ");
		double interestRate = (readDouble("Enter annual interest rate: ") / 100);
		double yield = balance * interestRate;
		double year1bal = balance + yield;
		println("Balance after one year = " + year1bal);
		double yield2 = year1bal * interestRate;
		double year2bal = year1bal + yield2;
		DecimalFormat df = new DecimalFormat("#.##");
		year2bal = Double.valueOf(df.format(year2bal));
		println("Balance after two years = " + year2bal);
	}
}