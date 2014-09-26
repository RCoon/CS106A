/*
 * File: OrdinalForm.java
 * ----------------------
 * This program tests the method ordinalForm(n) that takes an integer n and returns a string
 * indicating the corresponding ordinal number.
 */

import acm.program.*;

public class OrdinalForm extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		int n = 0;
		while (n != SENTINEL) {
			n = readInt("Enter an integer to return its ordinal number. Enter -1 to stop: ");
			println(ordinalForm(n));
		}
		//println(ordinalForm(n));
	}

	private String ordinalForm(int n) {
		int num = n;
		String strNum = Integer.toString(num);
		int length = strNum.length();
		if (length < 2) {
			if (strNum.charAt(length -1) == '1') {
				strNum += "st";
			} else if (strNum.charAt(length -1) == '2') {
				strNum += "nd";
			} else if (strNum.charAt(length -1) == '3') {
				strNum += "rd";
			} else {
				strNum += "th";
			}
		} else {
			if (strNum.substring(length - 2).equals("11") || strNum.substring(length - 2).equals("12") ||
					strNum.substring(length - 2).equals("13"))  {
				strNum += "th";
			} else if (strNum.charAt(length -1) == '1') {
				strNum += "st";
			} else if (strNum.charAt(length -1) == '2') {
				strNum += "nd";
			} else if (strNum.charAt(length -1) == '3') {
				strNum += "rd";
			} else {
				strNum += "th";
			}
		}
		return strNum;
	}
}
