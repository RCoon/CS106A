/*
 * File: RandomLabels.java
 * -----------------------
 * This program creates colored GLabels and puts them on the
 * screen in a random position with a random color.
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import java.awt.*;

public class RandomLabels2 extends GraphicsProgram {
	
	public void run() {
		drawRed();
		drawOrange();
		drawYellow();
		drawGreen();
		drawCyan();
		drawBlue();
		drawMagenta();
		addMouseListeners();
	}
		
// Called on mouse click to record the coordinates of the click
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		//gobj = getElementAt(lastX, lastY);
		if (red.contains(lastX, lastY)) {
			red.setColor(Color.RED);
		} else if (orange.contains(lastX, lastY)) {
			orange.setColor(Color.ORANGE);
		} else if (yellow.contains(lastX, lastY)) {
			yellow.setColor(Color.YELLOW);
		} else if (green.contains(lastX, lastY)) {
			green.setColor(Color.GREEN);
		} else if (cyan.contains(lastX, lastY)) {
			cyan.setColor(Color.CYAN);
		} else if (blue.contains(lastX, lastY)) {
			blue.setColor(Color.BLUE);
		} else if (magenta.contains(lastX, lastY)) {
			magenta.setColor(Color.MAGENTA);
		}
	}
	
// Called on mouse click to change the color of the label to it's appropriate color
	public void mouseReleased(MouseEvent e) {
		if (red.contains(lastX, lastY)) {
			red.setColor(rgen.nextColor());
		} else if (orange.contains(lastX, lastY)) {
			orange.setColor(rgen.nextColor());
		} else if (yellow.contains(lastX, lastY)) {
			yellow.setColor(rgen.nextColor());
		} else if (green.contains(lastX, lastY)) {
			green.setColor(rgen.nextColor());
		} else if (cyan.contains(lastX, lastY)) {
			cyan.setColor(rgen.nextColor());
		} else if (blue.contains(lastX, lastY)) {
			blue.setColor(rgen.nextColor());
		} else if (magenta.contains(lastX, lastY)) {
			magenta.setColor(rgen.nextColor());
		}
	}
	
	private GLabel drawRed() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		red.setLocation(x, y);
		red.setColor(rgen.nextColor());
		red.setFont(sb);
		add(red);
		return red;
	}
	
	private GLabel drawOrange() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		orange.setLocation(x, y);
		orange.setColor(rgen.nextColor());
		orange.setFont(sb);
		add(orange);
		return orange;
	}
	
	private GLabel drawYellow() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		yellow.setLocation(x, y);
		yellow.setColor(rgen.nextColor());
		yellow.setFont(sb);
		add(yellow);
		return yellow;
	}
	
	private GLabel drawGreen() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		green.setLocation(x, y);
		green.setColor(rgen.nextColor());
		green.setFont(sb);
		add(green);
		return green;
	}
	
	private GLabel drawCyan() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		cyan.setLocation(x, y);
		cyan.setColor(rgen.nextColor());
		cyan.setFont(sb);
		add(cyan);
		return cyan;
	}
	
	private GLabel drawBlue() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		blue.setLocation(x, y);
		blue.setColor(rgen.nextColor());
		blue.setFont(sb);
		add(blue);
		return blue;
	}
	
	private GLabel drawMagenta() {
		double x = rgen.nextDouble(0, getWidth() - magenta.getWidth());
		double y = rgen.nextDouble(0, getHeight() - magenta.getHeight());
		magenta.setLocation(x, y);
		magenta.setColor(rgen.nextColor());
		magenta.setFont(sb);
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
	//private GObject gobj; 
	private double lastX;
	private double lastY;
	Font sb = new Font("Serif", Font.BOLD, 24);
}