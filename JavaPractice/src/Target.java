/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	private static final double OUTER_CIRCLE_WIDTH = 144.0;
	private static final double WHITE_CIRCLE_WIDTH = 93.6;
	private static final double INNER_CIRCLE_WIDTH = 43.2;
	
	public void run() {
		
		// Draws three GOval objects with diameters
		// set in class variables.
		drawTarget();
		
	}
	
	public void drawCenteredOvals() {
		
		drawOuterOval();
		drawWhiteOval();
		drawInnerOval();
		
	}
	
	public void drawOuterOval() {
		
		double x = getWidth() / 2.0 - OUTER_CIRCLE_WIDTH / 2.0;
		double y = getHeight() / 2.0 - OUTER_CIRCLE_WIDTH / 2.0;
		GOval oval = new GOval(x, y, OUTER_CIRCLE_WIDTH, OUTER_CIRCLE_WIDTH);
		add(oval);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		oval.setColor(Color.WHITE);
	}
	
	public void drawWhiteOval() {
		
		double x = getWidth() / 2.0 - WHITE_CIRCLE_WIDTH / 2.0;
		double y = getHeight() / 2.0 - WHITE_CIRCLE_WIDTH / 2.0;
		GOval oval = new GOval(x, y, WHITE_CIRCLE_WIDTH, WHITE_CIRCLE_WIDTH);
		add(oval);
		oval.setFilled(true);
		oval.setFillColor(Color.WHITE);
		oval.setColor(Color.WHITE);
	}
	
	public void drawInnerOval() {
		double x = getWidth() / 2.0 - INNER_CIRCLE_WIDTH / 2.0;
		double y = getHeight() / 2.0 - INNER_CIRCLE_WIDTH / 2.0;
		GOval oval = new GOval(x, y, INNER_CIRCLE_WIDTH, INNER_CIRCLE_WIDTH);
		add(oval);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		oval.setColor(Color.WHITE);
	}
	
	public void drawTarget() {
		
		drawCenteredOvals();
	}
}
