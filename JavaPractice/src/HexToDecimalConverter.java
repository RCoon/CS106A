/*
 * File: HexToDecimalConverter.java
 * --------------------------------
 * This program converts hexadecimal values into their decimal equivalents.  
 * It will continue until the user enters a 0.
 */

import acm.program.*;

public class HexToDecimalConverter extends ConsoleProgram {

	private static final String SENTINEL = "0";
	
	public void run() {
		println("This program converts hexadecimal to decimal.");
		println("Enter 0 to stop.");
		String hexNum = "";
		while (!hexNum.equals(SENTINEL)) {
			hexNum = readLine("Enter a hexidecimal number: ");
			println(hexNum + " hex = " + hexToDecimal(hexNum) + " decimal");
		}
	}
	
	private String hexToDecimal(String hexNum) {
		String strHex = hexNum;
		int decNum = Integer.parseInt(strHex, 16);
		String decString = Integer.toString(decNum);
		return decString;
	}
}
