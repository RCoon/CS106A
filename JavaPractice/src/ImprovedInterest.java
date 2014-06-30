/*
* File: ImprovedInterest.java
* ------------------------------
* This program calculates interest over 2 years.
*/

import acm.program.*;
import java.text.DecimalFormat;

public class ImprovedInterest extends ConsoleProgram {
	public void run() {
		println("Interest calculation program");
		double balance = readDouble("Enter starting balance: ");
		double interestRate = (readDouble("Enter annual interest rate: ") / 100);
		for(int i = 1; i < 3; i++) {
			double yield = balance * interestRate;
			balance = balance + yield;
			DecimalFormat df = new DecimalFormat("#.##");
			balance = Double.valueOf(df.format(balance));
			println("Balance after " + i + " year" + (i == 1 ? "" : "s") + " = " + balance);
		}
	}
}