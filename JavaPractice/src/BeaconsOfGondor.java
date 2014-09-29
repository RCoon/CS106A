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
		addMouseListeners();
		createGraphicSignalTowers();
		drawTower();
	}
	
	private void createGraphicSignalTowers() {
		rohan = new GraphicSignalTower("Rohan", null, getWidth() * 0.88, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		halifirien = new GraphicSignalTower("Halifirien", rohan, getWidth() * 0.78, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		calenhad = new GraphicSignalTower("Calenhad", halifirien, getWidth() * 0.68, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		minRimmon = new GraphicSignalTower("Min-Rimmon", calenhad, getWidth() * 0.58, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		erelas = new GraphicSignalTower("Erelas", minRimmon, getWidth() * 0.48, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		nardol = new GraphicSignalTower("Nardol", erelas, getWidth() * 0.38, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		eilenach = new GraphicSignalTower("Eilenach", nardol, getWidth() * 0.28, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		amonDin = new GraphicSignalTower("Amon Din", eilenach, getWidth() * 0.18, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
		minasTirith = new GraphicSignalTower("Minas Tirith", amonDin, getWidth() * 0.08, getHeight() * 0.2, TOWER_WIDTH, TOWER_HEIGHT);
	}
	
	private void drawTower() {
		towers = new GCompound();
		towers.add(rohan);
		towers.add(halifirien);
		towers.add(calenhad);
		towers.add(minRimmon);
		towers.add(erelas);
		towers.add(nardol);
		towers.add(eilenach);
		towers.add(amonDin);
		towers.add(minasTirith);
		add(towers);
	}
	
	public void lightCurrentTower() {
		System.out.println("Lighting " + towerName);
		currentRect.setFilled(true);
		currentRect.setColor(Color.RED);
		pause(DELAY);
	}
	
	/** Called on mouse press to record the starting coordinates */
	public void mousePressed(MouseEvent e) {
		clickX = e.getX();
		clickY = e.getY();
		gobj = getElementAt(clickX, clickY);
		if (gobj == minasTirith) {
			minasTirith.signal();
		}
	}
	
// Private constants
	private static final double TOWER_WIDTH = 30;
	private static final double TOWER_HEIGHT = 150;
	private static final int DELAY = 500;
	
/* Private instance variables */
	private GraphicSignalTower rohan, halifirien, calenhad, minRimmon, erelas, nardol, eilenach, amonDin, minasTirith;
	private GRect currentRect;
	private GCompound towers;
	private double clickX; /* The mouse X position when clicked */
	private double clickY; /* The mouse Y position when clicked */
	private GObject gobj;
	private String towerName; /* The name of this tower */
}