/*
 * File: DateString.java
 * ---------------------
 * This program implements and tests the method dateString
 * that returns a string consisting of the day of the month, 
 * a hyphen, the first three letters in the name of the month,
 * another hyphen, and the last two digits of the year.
 */

import acm.program.*;

public class DateString extends ConsoleProgram {
	
	public void run() {
		int d = readInt("Enter the day of the month: ");
		int m = readInt("Enter the month as an integer: ");
		String y = readLine("Enter the 4 digit year: ");
		println(dateString(d, m, y));
	}

	private String dateString(int day, int month, String year) {
		newMonth = month;
		String last2year = year.substring(2);
		return day + "-" + getMonth() + "-" + last2year;
	}
	
	private String getMonth() {
		switch(newMonth) {
			case 1: return "Jan";
			case 2: return "Feb";
			case 3: return "Mar";
			case 4: return "Apr";
			case 5: return "May";
			case 6: return "Jun";
			case 7: return "Jul";
			case 8: return "Aug";
			case 9: return "Sep";
			case 10: return "Oct";
			case 11: return "Nov";
			case 12: return "Dec";
			default: return Integer.toString(newMonth);
		}
	}

// Instance variables
	private int newMonth; // The integer of the month
}
