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
	
	// Width of each box in the picture
	private static final double RECT_WIDTH = 150;
	
	// Height of each box in the picture
	private static final double RECT_HEIGHT = 60;
	
	// Space between boxes
	private static final double BOX_BUFFER = 20;
	
	public void run() {
		drawProgramBox();
		drawBottomRow();
		drawLines();
		bottomLabels();
	}
	private double leftOfCenter() {
		return getWidth() / 2.0 - RECT_WIDTH / 2.0;
	}
	private void drawProgramBox() {
		double x = leftOfCenter();
		double y = getHeight() / 2.0 - RECT_HEIGHT;
		GRect topRow = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
		add(topRow);
		GLabel label = new GLabel("Program", x,y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(RECT_WIDTH / 2.0 - x1, RECT_HEIGHT / 2.0 + y1);
	}
	private void drawBottomRow() {
		double x = leftOfCenter() - RECT_WIDTH - BOX_BUFFER;
		double y = getHeight() / 2.0 + RECT_HEIGHT;
		for (int i = 0; i < 3; i++) {
			GRect lowerRow = new GRect(x, y, RECT_WIDTH, RECT_HEIGHT);
			add(lowerRow);
			x += RECT_WIDTH + BOX_BUFFER;
		} 
	}
	private void drawLines() {
		drawLeft();
		drawCenter();
		drawRight();
	}
	private void drawLeft() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 2.0;
		double x1 = getWidth() / 2.0 - (RECT_WIDTH - BOX_BUFFER);
		double y1 = getHeight() / 2.0 + RECT_HEIGHT;
		GLine left = new GLine(x0, y0, x1, y1);
		add(left);
	}
	private void drawCenter() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 2.0;
		double x1 = getWidth() / 2.0;
		double y1 = getHeight() / 2.0 + RECT_HEIGHT;
		GLine center = new GLine(x0, y0, x1, y1);
		add(center);
	}
	private void drawRight() {
		double x0 = getWidth() / 2.0;
		double y0 = getHeight() / 2.0;
		double x1 = getWidth() / 2.0 + (RECT_WIDTH + BOX_BUFFER);
		double y1 = getHeight() / 2.0 + RECT_HEIGHT;
		GLine right = new GLine(x0, y0, x1, y1);
		add(right);
	}
	private void graphicsProgram() {
		double x = leftOfCenter() - RECT_WIDTH - BOX_BUFFER;
		double y = getHeight() / 2.0 + RECT_HEIGHT;
		GLabel label = new GLabel("GraphicsProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(RECT_WIDTH / 2.0 - x1, RECT_HEIGHT / 2.0 + y1);
	}
	private void consoleProgram() {
		double x = leftOfCenter();
		double y = getHeight() / 2.0 + RECT_HEIGHT;
		GLabel label = new GLabel("ConsoleProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(RECT_WIDTH / 2.0 - x1, RECT_HEIGHT / 2.0 + y1);
	}
	private void dialogProgram() {
		double x = leftOfCenter() + RECT_WIDTH + BOX_BUFFER;
		double y = getHeight() / 2.0 + RECT_HEIGHT;
		GLabel label = new GLabel("DialogProgram", x, y);
		add(label);
		double x1 = label.getWidth() / 2.0;
		double y1 = label.getAscent() / 2.0;
		label.move(RECT_WIDTH / 2.0 - x1, RECT_HEIGHT / 2.0 + y1);
	}
	private void bottomLabels() {
		graphicsProgram();
		consoleProgram();
		dialogProgram();
	}
}