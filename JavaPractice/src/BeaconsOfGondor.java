/* File: BeaconsofGondor.java */
/**
* This program animates the beacons of Gondor.
*/

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class BeaconsOfGondor extends GraphicsProgram {

	public void run() {
		createSignalTowers();
		drawSignalTowers();
	}

	private void createSignalTowers() {
		rohan = new SignalTower("Rohan", null, getWidth() * 0.9, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		halifirien = new SignalTower("Halifirien", rohan, getWidth() * 0.8, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		calenhad = new SignalTower("Calenhad", halifirien, getWidth() * 0.7, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		minRimmon = new SignalTower("Min-Rimmon", calenhad, getWidth() * 0.6, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		erelas = new SignalTower("Erelas", minRimmon, getWidth() * 0.5, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		nardol = new SignalTower("Nardol", erelas, getWidth() * 0.4, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		eilenach = new SignalTower("Eilenach", nardol, getWidth() * 0.3, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		amonDin = new SignalTower("Amon Din", eilenach, getWidth() * 0.2, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		minasTirith = new SignalTower("Minas Tirith", amonDin, getWidth() * 0.1, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		}
	
	private GCompound drawSignalTowers() {
		towers = new GCompound();
		towers.add(minasTirith);
		add(towers);
		return towers;
	}
	
/* Method: signal() */
/**
* This method represents sending a signal to this tower. The effect
* is to light the signal fire here and to send an additional signal
* message to the next tower in the chain, if any.
*/
	public void signal() {
		lightCurrentTower();
		if (nextTower != null) nextTower.signal();
	}
/* Method: lightCurrentTower() */
/**
* This method lights the signal fire for this tower. This version
* supplies a temporary implementation (typically called a "stub")
* that simply prints the name of the tower to the standard output
* channel. If you wanted to redesign this class to be part of a
* graphical application, for example, you could override this
* method to draw an indication of the signal fire on the display.
*/
	public void lightCurrentTower() {
		currentRect.setFilled(true);
		currentRect.setColor(Color.RED);
		pause(DELAY);
		
	}
	
// Private constants
	private static final double TOWER_WIDTH = 20;
	private static final double TOWER_HEIGHT = 100;
	private static final int DELAY = 500;
	
/* Private instance variables */
	private String towerName; /* The name of this tower */
	private SignalTower nextTower; /* A link to the next tower */
	private SignalTower rohan, halifirien, calenhad, minRimmon, erelas, nardol, eilenach, amonDin, minasTirith;
	private GRect currentRect;
	private GCompound towers;
}