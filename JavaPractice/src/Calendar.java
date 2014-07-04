/*
 * File: Checkerboard2.java
 * -----------------------
 * This program draws a calendar on the graphics window.
 * The size of the calendar is specified by the
 * constants DAYS_IN_MONTH and DAY_MONTH_STARTS,
 * and the calendar fills the vertical space available 
 * and has the dates in it.
 */

import acm.graphics.*;
import acm.program.*;

public class Calendar extends GraphicsProgram {

	/* The number of days in the month */
	private static final int DAYS_IN_MONTH = 31;
	
	/* The day of the week on which the month starts */
	/* (Sunday = 0, Monday = 1, Tuesday = 2, and so on) */
	private static final int DAY_MONTH_STARTS = 6;
	
	/* The width in pixels of a day on the calendar */
	private static final int DAY_WIDTH = 40;
	
	/* The height in pixels of a day on the calendar */
	private static final int DAY_HEIGHT = 30;

	// Number of columns
	private static final int NCOLUMNS = 7;

	// Runs the program
	public void run() {
		// Number of rows
		int numRows = 5;
		if(((DAY_MONTH_STARTS + DAYS_IN_MONTH) / 7.0) > 5) {
			numRows = 6;
		} else if(((DAY_MONTH_STARTS + DAYS_IN_MONTH) / 7.0) == 4.0) {
		    numRows = 4;
		}
		int day = 1;
		// int sqSize = getHeight() / numRows;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < NCOLUMNS; j++) {
				GRect sq = new GRect(j * DAY_WIDTH, i * DAY_HEIGHT, DAY_WIDTH, DAY_HEIGHT);
				// sq.setFilled(((i + j) % 2) != 0);
				add(sq);
				GLabel date = new GLabel("" + day, j * DAY_WIDTH + 5, i * DAY_HEIGHT + 12);
				if((i * 7 + j) >= DAY_MONTH_STARTS && day <= DAYS_IN_MONTH) {
					add(date);
					day++;
				}
			}
		}
	}
}

