/*
 * File: Beacons.java
 * ------------------
 * This program uses the Signal Tower class to demonstrate message-passing in the console.
 */

import acm.program.*;

public class Beacons extends ConsoleProgram {
	
	public void run() {
		createSignalTowers();
		minasTirith.signal();
	}
	
	private void createSignalTowers() {
		rohan = new SignalTower("Rohan", null);
		halifirien = new SignalTower("Halifirien", rohan);
		calenhad = new SignalTower("Calenhad", halifirien);
		minRimmon = new SignalTower("Min-Rimmon", calenhad);
		erelas = new SignalTower("Erelas", minRimmon);
		nardol = new SignalTower("Nardol", erelas);
		eilenach = new SignalTower("Eilenach", nardol);
		amonDin = new SignalTower("Amon Din", eilenach);
		minasTirith = new SignalTower("Minas Tirith", amonDin);
	}

// Instance variables
	SignalTower rohan, halifirien, calenhad, minRimmon, erelas, nardol, eilenach, amonDin, minasTirith;
}
