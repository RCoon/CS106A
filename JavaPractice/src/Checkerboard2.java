/*
 * File: Checkerboard2.java
 * -----------------------
 * This program draws a checkerboard with checkers on it.
 */

import acm.graphics.*;
import acm.program.*;

/*
 * This class draws a checkerboard on a the graphics window.
 * The size of the checkerboard is specified by the
 * constants NROWS and NCOLUMNS, and the checkerboard fills
 * the vertical space available and has checkers on it.
 */

public class Checkerboard2 extends GraphicsProgram {

	// Number of rows
	private static final int NROWS = 8;

	// Number of columns
	private static final int NCOLUMNS = 8;

	// Runs the program
	public void run() {
		int sqSize = getHeight() / NROWS;
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLUMNS; j++) {
				int x = j * sqSize;
				int y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				// sq.setFilled(((i + j) % 2) != 0);
				add(sq);
				double ovalX = (j * sqSize) + 4; // (j * (sqSize * 1.3));
				double ovalY = (i * sqSize) + 4; // (i * (sqSize * 1.3));
				GOval oval = new GOval(ovalX, ovalY, (sqSize * 0.7), (sqSize * 0.7));
				if(((i + j) % 2) != 0) {
					add(oval);
				}
			}
		}
	}
}
