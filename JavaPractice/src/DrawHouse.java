/*
 * File: DrawHouse.java
 * --------------------
 * This programs draws a line drawing of a house.
 */

import acm.program.*;
import acm.graphics.*;

public class DrawHouse extends GraphicsProgram {
	
	public void run() {
		drawMain();
		drawRoof();
		drawDoor();
		drawLowerLeftWindow();
		drawLowerRightWindow();
		drawUpperLeftWindow();
		drawUpperRightWindow();
	}
	
	private GRect drawMain() {
		double x = (getWidth() / 2) - (HOUSE_WIDTH / 2);
		double y = (getHeight() / 2) - (HOUSE_HEIGHT / 3);
		house = new GRect(x, y, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(house);
		return house;
	}
	
	private GPolygon drawRoof() {
		double x = getWidth() / 2;
		double y = (getHeight() / 6);
		roof = new GPolygon(x, y);
		roof.addVertex(0, -HOUSE_HEIGHT * 0.2);
		roof.addVertex(-HOUSE_WIDTH / 2, HOUSE_HEIGHT * 0.2);
		roof.addVertex(HOUSE_WIDTH / 2, HOUSE_HEIGHT * 0.2);
		add(roof);
		return roof;
	}
	
	private GCompound drawDoor() {
		double x = (getWidth() / 2) - (DOOR_WIDTH / 2);
		double y = (getHeight() / 2) + (DOOR_HEIGHT * 1.225);
		double x1 = x + (DOOR_WIDTH * 0.7);
		double y1 = y + (DOOR_HEIGHT / 2) - (DOORKNOB_WIDTH / 2);
		door = new GCompound();
		GRect rect = new GRect(x, y, DOOR_WIDTH, DOOR_HEIGHT);
		door.add(rect);
		GOval oval = new GOval(x1, y1, DOORKNOB_WIDTH, DOORKNOB_WIDTH);
		door.add(oval);
		add(door);
		return door;
	}
	
	private GCompound drawLowerLeftWindow() {
		double x = (getWidth() / 2) - (LOWERWINDOW_WIDTH / 1.5 + LOWERWINDOW_WIDTH);
		double y = getHeight() * 0.7;
		double x1 = x + (LOWERWINDOW_WIDTH / 3.0);
		double y1 = y + WINDOW_HEIGHT;
		double x2 = x1 + (LOWERWINDOW_WIDTH / 3.0);
		double x3 = x + LOWERWINDOW_WIDTH;
		double y2 = y + (WINDOW_HEIGHT / 2.0);
		bottomLeft = new GCompound();
		GRect rect = new GRect(x, y, LOWERWINDOW_WIDTH, WINDOW_HEIGHT);
		bottomLeft.add(rect);
		GLine vert1 = new GLine(x1, y, x1, y1);
		add(vert1);
		GLine vert2 = new GLine(x2, y, x2, y1);
		add(vert2);
		GLine horizontal = new GLine(x, y2, x3, y2);
		add(horizontal);
		add(bottomLeft);
		return bottomLeft;
	}
		
	private GCompound drawLowerRightWindow() {
		double x = (getWidth() / 2) + LOWERWINDOW_WIDTH / 1.5;
		double y = getHeight() * 0.7;
		double x1 = x + (LOWERWINDOW_WIDTH / 3.0);
		double y1 = y + WINDOW_HEIGHT;
		double x2 = x1 + (LOWERWINDOW_WIDTH / 3.0);
		double x3 = x + LOWERWINDOW_WIDTH;
		double y2 = y + (WINDOW_HEIGHT / 2.0);
		bottomRight = new GCompound();
		GRect rect = new GRect(x, y, LOWERWINDOW_WIDTH, WINDOW_HEIGHT);
		bottomRight.add(rect);
		GLine vert1 = new GLine(x1, y, x1, y1);
		add(vert1);
		GLine vert2 = new GLine(x2, y, x2, y1);
		add(vert2);
		GLine horizontal = new GLine(x, y2, x3, y2);
		add(horizontal);
		add(bottomRight);
		return bottomRight;
	}
	
	private GCompound drawUpperLeftWindow() {
		double x = (getWidth() / 2) - (HOUSE_WIDTH / 3);
		double y = (getHeight() / 2) - WINDOW_HEIGHT;
		double x1 = x + (UPPERWINDOW_WIDTH / 2);
		double y1 = y + WINDOW_HEIGHT;
		double x2 = x + UPPERWINDOW_WIDTH;
		double y2 = y + (WINDOW_HEIGHT / 2);
		topLeft = new GCompound();
		GRect rect = new GRect(x, y, UPPERWINDOW_WIDTH, WINDOW_HEIGHT);
		topLeft.add(rect);
		GLine vert = new GLine(x1, y, x1, y1);
		add(vert);
		GLine horizontal = new GLine(x, y2, x2, y2);
		add(horizontal);
		add(topLeft);
		return topLeft;
	}
	
	private GCompound drawUpperRightWindow() {
		double x = (getWidth() / 2) + (HOUSE_WIDTH / 5);
		double y = (getHeight() / 2) - WINDOW_HEIGHT;
		double x1 = x + (UPPERWINDOW_WIDTH / 2);
		double y1 = y + WINDOW_HEIGHT;
		double x2 = x + UPPERWINDOW_WIDTH;
		double y2 = y + (WINDOW_HEIGHT / 2);
		topRight = new GCompound();
		GRect rect = new GRect(x, y, UPPERWINDOW_WIDTH, WINDOW_HEIGHT);
		topRight.add(rect);
		GLine vert = new GLine(x1, y, x1, y1);
		add(vert);
		GLine horizontal = new GLine(x, y2, x2, y2);
		add(horizontal);
		add(topRight);
		return topRight;
	}
	
// Private constants
	private static final double HOUSE_WIDTH = 300;
	private static final double HOUSE_HEIGHT = 250;
	private static final double DOOR_WIDTH = HOUSE_WIDTH * 0.15;
	private static final double DOOR_HEIGHT = HOUSE_HEIGHT * 0.3;
	private static final double DOORKNOB_WIDTH = DOOR_HEIGHT * 0.1;
	private static final double LOWERWINDOW_WIDTH = HOUSE_WIDTH * 0.225;
	private static final double WINDOW_HEIGHT = HOUSE_HEIGHT * 0.2;
	private static final double UPPERWINDOW_WIDTH = LOWERWINDOW_WIDTH * (2.0/3.0);
 
// Instance variables
	private GRect house;
	private GPolygon roof;
	private GCompound door, topLeft, topRight, bottomLeft, bottomRight;
}
