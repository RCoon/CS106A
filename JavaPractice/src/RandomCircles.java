/*
 * File: RandomCircles.java
 * ------------------------
 * This program draws a set of 10 random circles with
 * different sizes, positions, and colors.
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {

// Number of circles
	private static final int NCIRCLES = 10;
	
// Minimum radius
	private static final int MIN_RADIUS = 5;
	
// Maximum radius
	private static final int MAX_RADIUS = 50;
	
// Run the program
	public void run() {
		for (int i = 0; i < NCIRCLES; i++) {
			int diameter = rgen.nextInt(MIN_RADIUS, MAX_RADIUS) * 2;
			int x = rgen.nextInt(0, (getWidth() - diameter));
			int y = rgen.nextInt(0, (getHeight() - diameter));
			GOval circle = new GOval(x, y, diameter, diameter);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
			add(circle);
		}
	}
	
// Private instance variable	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}