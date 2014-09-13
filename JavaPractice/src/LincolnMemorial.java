/*
 * File: LincolnMemorial.java
 * --------------------------
 * This program draws a stylized version of the Lincoln Memorial.
 */

import acm.program.*;
import acm.graphics.*;

public class LincolnMemorial extends GraphicsProgram {
	
	public void run() {
		drawMain();
		drawRoof();
		drawPillars();
		drawCircles();
		drawLincoln();
	}
	
	private GCompound drawMain() {
		double x = (getWidth() / 2) - (BLDG_WIDTH / 2);
		double y = (getHeight() / 2) - (BLDG_HEIGHT / 2);
		double xr = (getWidth() / 2) + (BLDG_WIDTH / 2);
		double y1 = y + BLDG_HEIGHT * 0.2;
		double y2 = y + BLDG_HEIGHT * 0.8;
		main = new GCompound();
		GRect rect = new GRect(x, y, BLDG_WIDTH, BLDG_HEIGHT);
		main.add(rect);
		GLine top = new GLine(x, y1, xr, y1);
		main.add(top);
		GLine bottom = new GLine(x, y2, xr, y2);
		main.add(bottom);
		add(main);
		return main;
	}

	private GRect drawRoof() {
		double x = (getWidth() / 2) - (ROOF_WIDTH / 2);
		double y = (getHeight() / 2) - (BLDG_HEIGHT / 2) - (ROOF_HEIGHT);
		roof = new GRect(x, y, ROOF_WIDTH, ROOF_HEIGHT);
		add(roof);
		return roof;
	}
	
	private GCompound drawPillars() {
		double x = (getWidth() / 2) - (BLDG_WIDTH / 2);
		double y = (getHeight() / 2) - (BLDG_HEIGHT / 2) + BLDG_HEIGHT * 0.2;
		pillars = new GCompound();
		for(int i = 0; i < 12; i++) {
			GRect first = new GRect(x, y, PILLAR_WIDTH, PILLAR_HEIGHT);
			pillars.add(first);
			x += PILLAR_WIDTH + (BLDG_WIDTH - (PILLAR_WIDTH * 12)) / 11;
		}
		//GRect first = new GRect(x, y, PILLAR_WIDTH, PILLAR_HEIGHT);
		//pillars.add(first);
		add(pillars);
		return pillars;
	}
	
	private GCompound drawCircles() {
		double x = (getWidth() / 2) - (BLDG_WIDTH / 2) + (PILLAR_WIDTH * 0.1);
		double y = (getHeight() / 2) - (BLDG_HEIGHT / 2) + (BLDG_HEIGHT * 0.1) - (OVAL_SIZE / 2);
		circles = new GCompound();
		for(int i = 0; i < 12; i++) {
			GOval circle = new GOval(x, y, OVAL_SIZE, OVAL_SIZE);
			circles.add(circle);
			x += PILLAR_WIDTH + (BLDG_WIDTH - (PILLAR_WIDTH * 12)) / 11;
		}
		add(circles);
		return circles;
	}
	
	private GCompound drawLincoln() {
		double x = (getWidth() / 2) - (LINCOLN_WIDTH / 2);
		double y = (getHeight() / 2) - (BLDG_HEIGHT / 2) + (BLDG_HEIGHT * 0.8) - LINCOLN_HEIGHT;
		//double x1 = 
		double y1 = y - OVAL_SIZE;
		lincoln = new GCompound();
		GRect rect = new GRect(x, y, LINCOLN_WIDTH, LINCOLN_HEIGHT);
		lincoln.add(rect);
		GOval head = new GOval(x, y1, OVAL_SIZE, OVAL_SIZE);
		lincoln.add(head);
		add(lincoln);
		return lincoln;
	}
	
// Private constants
	private static final double BLDG_WIDTH = 360;
	private static final double BLDG_HEIGHT = 200;
	private static final double PILLAR_WIDTH = BLDG_WIDTH / 24;
	private static final double PILLAR_HEIGHT = BLDG_HEIGHT * 0.6;
	private static final double ROOF_WIDTH = BLDG_WIDTH * 0.8;
	private static final double ROOF_HEIGHT = BLDG_HEIGHT * 0.2;
	private static final double OVAL_SIZE = ROOF_HEIGHT * 0.3;
	private static final double LINCOLN_WIDTH = PILLAR_WIDTH * 0.8;
	private static final double LINCOLN_HEIGHT = PILLAR_HEIGHT * 0.2;
	
// Instance variables
	private GCompound main, lincoln, pillars, circles;
	private GRect roof;
}
