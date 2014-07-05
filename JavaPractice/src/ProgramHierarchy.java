/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	public static final double RECT_WIDTH = 150;
	public static final double RECT_HEIGHT = 60;
	
	public void run() {
		
		drawProgramHierarchy();
	}

	public double leftOfCenter() {
		return getWidth() / 2.0 - RECT_WIDTH / 2.0;
	}
	
	public void drawTopRow() {

		double x = leftOfCenter();
		double y = getHeight() / 4.0;
		GRect topRow = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(topRow);
	}
	
	public void drawBottomRow() {
		
		double x = leftOfCenter() - RECT_WIDTH - 20;
		double y = getHeight() / 2.0;
		for (int i = 0; i < 3; i++) {
			GRect lowerRow = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
			add(lowerRow);
			x += RECT_WIDTH + 20;
		} 
	}
	
	public void drawLines() {
		drawLeft();
		drawCenter();
		drawRight();
	}
	
	public void drawLeft() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 4.0 + RECT_HEIGHT;
		double x1 = leftOfCenter() - (RECT_WIDTH / 2.0 + 20);
		double y1 = getHeight() / 2.0;
		GLine left = new GLine(x0, y0, x1, y1);
		add(left);
	}
	
	public void drawCenter() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 4.0 + RECT_HEIGHT;
		double x1 = getWidth() / 2.0;
		double y1 = getHeight() / 2.0;
		GLine center = new GLine(x0, y0, x1, y1);
		add(center);
	}
	
	public void drawRight() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 4.0 + RECT_HEIGHT;
		double x1 = getWidth() / 2.0 + RECT_WIDTH + 20;
		double y1 = getHeight() / 2.0;
		GLine right = new GLine(x0, y0, x1, y1);
		add(right);
	}
	
	public void topLabel() {
		double x = getWidth() / 2.0;
		double y = getHeight() / 3.0;
		GLabel label = new GLabel("Program", x,y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(-x1, -y1);
	}
	
	public void graphicsProgram() {
		double x = leftOfCenter() - (RECT_WIDTH / 2.0 + 20);
		double y = getHeight() / 1.725;
		GLabel label = new GLabel("GraphicsProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(-x1, -y1);
	}
	
	public void consoleProgram() {
		double x = getWidth() / 2.0;
		double y = getHeight() / 1.725;
		GLabel label = new GLabel("ConsoleProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(-x1, -y1);
	}
	
	public void dialogProgram() {
		double x = getWidth() / 2.0 + RECT_WIDTH + 20;
		double y = getHeight() / 1.725;
		GLabel label = new GLabel("DialogProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(-x1, -y1);
	}
	
	public void bottomLabels() {
		graphicsProgram();
		consoleProgram();
		dialogProgram();
	}

	public void drawProgramHierarchy() {
		drawTopRow();
		drawBottomRow();
		drawLines();
		topLabel();
		bottomLabels();
	}
}

