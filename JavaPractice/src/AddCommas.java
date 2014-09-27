/*
 * File: AddCommas.java
 * --------------------
 * This program implements the addCommasToNumericString method that takes a string of decimal digits
 * and returns the string formed by inserting commas at every third position, starting on the right.
 */

import acm.program.*;

public class AddCommas extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}
	
	private String addCommasToNumericString(String digits) {
		String strNumber = digits;
		String result = "";
		char ch;
		int length = strNumber.length();
			if (length > 3) {
				for (int i = 1; i <= length; i++) {
					ch = strNumber.charAt(length - i);
					result = ch + result;
						if (i % 3 == 0 && i != length) {
							result = "," + result;
						}
				}
			} else {
				return strNumber;
			}
		return result;
	}

}
