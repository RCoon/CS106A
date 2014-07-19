/*
 * File: RadioactiveDecay.java
 * ---------------------------
 * This program simulates the decay of a sample of 10000
 * atoms of radioactive material, where each atom has a 50%
 * chance of decaying in a year.  The program will display
 * the number of atoms remaining at the end of each year.
 */

import acm.program.*;
import acm.util.*;

public class RadioactiveDecay extends ConsoleProgram {

// Number of radioactive atoms
	private static final int NUM_ATOMS = 10000;
	
	public void run() {
		int atomsRemaining = NUM_ATOMS;
		int yearCount = 0;
		println("There are " + NUM_ATOMS + " atoms initially");
		while (atomsRemaining > 0) {
			for (int i = 0; i < atomsRemaining; i++) {
				boolean hasDecayed = rgen.nextBoolean(0.5);
				if (hasDecayed) {
					atomsRemaining--;
				}
			}
			yearCount++;
			println("There are " + atomsRemaining + " atoms at the end of year " + yearCount);
		}	
	}

// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
