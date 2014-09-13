/*
 * File: RandomLabels.java
 * -----------------------
 * This program creates colored GLabels and puts them on the
 * screen in a random position with a random color.
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomLabels extends GraphicsProgram {
	
	public void run() {
		drawRed();
		drawOrange();
		drawYellow();
		drawGreen();
		drawCyan();
		drawBlue();
		drawMagenta();
	}
		
	private GLabel drawRed() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		red.setLocation(x, y);
		red.setColor(rgen.nextColor());
		add(red);
		return red;
	}
	
	private GLabel drawOrange() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		orange.setLocation(x, y);
		orange.setColor(rgen.nextColor());
		add(orange);
		return orange;
	}
	
	private GLabel drawYellow() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		yellow.setLocation(x, y);
		yellow.setColor(rgen.nextColor());
		add(yellow);
		return yellow;
	}
	
	private GLabel drawGreen() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		green.setLocation(x, y);
		green.setColor(rgen.nextColor());
		add(green);
		return green;
	}
	
	private GLabel drawCyan() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		cyan.setLocation(x, y);
		cyan.setColor(rgen.nextColor());
		add(cyan);
		return cyan;
	}
	
	private GLabel drawBlue() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		blue.setLocation(x, y);
		blue.setColor(rgen.nextColor());
		add(blue);
		return blue;
	}
	
	private GLabel drawMagenta() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		magenta.setLocation(x, y);
		magenta.setColor(rgen.nextColor());
		add(magenta);
		return magenta;
	}

// Private instance variables
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GLabel red = new GLabel("RED");
	GLabel orange = new GLabel("ORANGE");
	GLabel yellow = new GLabel("YELLOW");
	GLabel green = new GLabel("GREEN");
	GLabel cyan = new GLabel("CYAN");
	GLabel blue = new GLabel("BLUE");
	GLabel magenta = new GLabel("MAGENTA");
}
