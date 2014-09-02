/*
 * File: HouseOfUsher.java
 * -----------------------
 * This program draws a castle-like house.
 */

import acm.program.*;
import acm.graphics.*;

public class HouseOfUsher extends GraphicsProgram {
	
	public void run() {
		drawMain();
		drawLeftTower();
		drawRightTower();
		drawDoor();
		drawWindows();
	}
	
	private GCompound drawMain() {
		double x = (getWidth() / 2) - (HOUSE_WIDTH / 2);
		double y = (getHeight() / 2) - (HOUSE_HEIGHT / 3);
		double xr = getWidth() / 2;
		double yr = getHeight() / 5.5;
		main = new GCompound();
		GRect rect = new GRect(x, y, HOUSE_WIDTH, HOUSE_HEIGHT);
		main.add(rect);
		GPolygon roof = new GPolygon(xr, yr);
		roof.addVertex(0, -HOUSE_HEIGHT * 0.3);
		roof.addVertex(-HOUSE_WIDTH / 2, HOUSE_HEIGHT * 0.3);
		roof.addVertex(HOUSE_WIDTH / 2, HOUSE_HEIGHT * 0.3);
		main.add(roof);
		add(main);
		return main;
	}
	
	private GCompound drawLeftTower() {
		double x = (getWidth() / 2) - (HOUSE_WIDTH / 2) - TOWER_WIDTH;
		double y = (getHeight() / 2) - (TOWER_HEIGHT / 2.25);
		double xr = (getWidth() / 2) - (HOUSE_WIDTH / 2) - (TOWER_WIDTH / 2);
		double yr = getHeight() / 7;
		leftTower = new GCompound();
		GRect tower = new GRect(x, y, TOWER_WIDTH, TOWER_HEIGHT);
		leftTower.add(tower);
		GPolygon roof = new GPolygon(xr, yr);
		roof.addVertex(0, -TOWER_HEIGHT * 0.15);
		roof.addVertex(-TOWER_WIDTH / 2, TOWER_HEIGHT * 0.15);
		roof.addVertex(TOWER_WIDTH / 2, TOWER_HEIGHT * 0.15);
		leftTower.add(roof);
		add(leftTower);
		return leftTower;
	}

	private GCompound drawRightTower() {
		double x = (getWidth() / 2) + (HOUSE_WIDTH / 2);
		double y = (getHeight() / 2) - (TOWER_HEIGHT / 2.25);
		double xr = (getWidth() / 2) + (HOUSE_WIDTH / 2) + (TOWER_WIDTH / 2);
		double yr = getHeight() / 7;
		rightTower = new GCompound();
		GRect tower = new GRect(x, y, TOWER_WIDTH, TOWER_HEIGHT);
		rightTower.add(tower);
		GPolygon roof = new GPolygon(xr, yr);
		roof.addVertex(0, -TOWER_HEIGHT * 0.15);
		roof.addVertex(-TOWER_WIDTH / 2, TOWER_HEIGHT * 0.15);
		roof.addVertex(TOWER_WIDTH / 2, TOWER_HEIGHT * 0.15);
		rightTower.add(roof);
		add(rightTower);
		return rightTower;
	}
	
	private GCompound drawDoor() {
		double x = (getWidth() / 2) - (DOOR_WIDTH / 2);
		double y = (getHeight() / 2) + (DOOR_HEIGHT * 1.225);
		double xr = (getWidth() / 2);
		double yr = y - (DOOR_HEIGHT * 0.15);
		door = new GCompound();
		GRect rect = new GRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
		door.add(rect);
		GPolygon roof = new GPolygon(xr, yr);
		roof.addVertex(0, -DOOR_HEIGHT * 0.15);
		roof.addVertex(-DOOR_WIDTH / 2, DOOR_HEIGHT * 0.15);
		roof.addVertex(DOOR_WIDTH / 2, DOOR_HEIGHT * 0.15);
		door.add(roof);
		add(door);
		return door;
	}
	
	private GCompound drawWindows() {
		double x = (getWidth() / 2) - (HOUSE_WIDTH * 0.35);
		double y = (getHeight() / 2) - WINDOW_WIDTH;
		double x2 = (getWidth() / 2) + (HOUSE_WIDTH * 0.15);
		GCompound windows = new GCompound();
		leftWindow = new GRect(x, y, WINDOW_WIDTH, WINDOW_WIDTH);
		windows.add(leftWindow);
		rightWindow = new GRect(x2, y, WINDOW_WIDTH, WINDOW_WIDTH);
		windows.add(rightWindow);
		add(windows);
		return windows;
	}
	
// Private constants
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 250;
	private static final double TOWER_WIDTH = HOUSE_WIDTH * 0.2;
	private static final double TOWER_HEIGHT = HOUSE_HEIGHT * 1.2;
	private static final double DOOR_WIDTH = HOUSE_WIDTH * 0.2;
	private static final double DOOR_HEIGHT = HOUSE_HEIGHT * 0.3;
	private static final double WINDOW_WIDTH = HOUSE_WIDTH * 0.2;
	
// Instance variables
	private GCompound main, leftTower, rightTower, door;
	private GRect leftWindow, rightWindow;
}