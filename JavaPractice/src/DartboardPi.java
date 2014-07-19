/*
 * File: DartboardPi.java
 * ----------------------
 * This program simulates throwing 10,000 darts at
 * an imaginary dart board; and tests whether each dart
 * lies within the dart board or the bounding square.
 * By comparing the ratio of darts inside the circle
 * to those inside the square, it will roughly be
 * PI / 4.
 */

import acm.program.*;
import acm.util.*;

public class DartboardPi extends ConsoleProgram {

// Number of simulated darts to be thrown
	private static final int NUM_DARTS = 10000;
	
	public void run() {
		double dartsInCircle = 0;
		double piEstimate;
		for (int i = 0; i < NUM_DARTS; i++) {
			double x = rgen.nextDouble(-1.0, 1.0);
			double y = rgen.nextDouble(-1.0, 1.0);
			if ((x * x) + (y * y) < 1) {
				dartsInCircle++;
			}
		}
		piEstimate = (dartsInCircle / NUM_DARTS) * 4;
		println("Estimate of pi: " + piEstimate);
	}
	
// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
