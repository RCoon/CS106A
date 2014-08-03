/*
 * File: Heart.java
 * ----------------
 * This program draws a heart centered in the screen window.
 */

import acm.program.*;
import acm.graphics.*;

public class Heart extends GraphicsProgram {
	
	private static final double HEART_WIDTH = 100;
	private static final double HEART_HEIGHT = 100;
	
	public void run() {
		double x = getWidth() / 2;
		double y = getHeight();
		double x1 = x - HEART_WIDTH;
		double y1 = y - HEART_HEIGHT;
		GLine one = new GLine(x, y, x1, y1);
		add(one);
		GLine two = new GLine(x1, y1, x, getHeight() / 2);
		add(two);
		two.setVisible(false);
		GLine three = new GLine(x, getHeight() / 2, x + HEART_WIDTH, y1);
		add(three);
		three.setVisible(false);
		GLine four = new GLine(x + HEART_WIDTH, y1, x, y);
		add(four);
		GArc left = new GArc(x1 - (HEART_WIDTH / 5), getHeight() / 2 - (HEART_HEIGHT / 5), HEART_WIDTH * 1.4, HEART_HEIGHT * 1.4, 45, 180);
		add(left);
		GArc right = new GArc(x - (HEART_WIDTH / 5), getHeight() / 2 - (HEART_HEIGHT / 5), HEART_WIDTH * 1.4, HEART_HEIGHT * 1.4, -45, 180);
		add(right);
	}
}
