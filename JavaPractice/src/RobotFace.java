/*
 * File: RobotFace.java
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class RobotFace extends GraphicsProgram {	
	
	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 150;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
	
	public void run() {
		// Draws the head, eyes, and mouth
		drawHead();
		drawEyes();
		drawMouth();
	}
	private void drawHead() {
		double x = (getWidth() / 2) - (HEAD_WIDTH / 2);
		double y = (getHeight() / 2) - (HEAD_HEIGHT / 2);
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		add(head);
		head.setColor(Color.BLACK);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
	}
	private void drawEyes() {
		double x = (getWidth() / 2) - (HEAD_WIDTH / 4 + EYE_RADIUS);
		double y = (getHeight() / 2) - (HEAD_HEIGHT / 2) + (HEAD_HEIGHT / 4);
		for (int i = 0; i < 2; i++) {
			GOval eye = new GOval(x, y, EYE_RADIUS * 2, EYE_RADIUS * 2);
			x += HEAD_WIDTH / 2;
			add(eye);
			eye.setFilled(true);
			eye.setColor(Color.YELLOW);
		}
	}
	private void drawMouth() {
		double x = (getWidth() / 2) - (MOUTH_WIDTH / 2);
		double y = (getHeight() / 2) + (HEAD_HEIGHT / 4);
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		add(mouth);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
	}
}