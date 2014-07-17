/*
 * File: DrawLines.java
 * --------------------
 * This program allows the user to draw lines on the canvas.
 * Pressing the mouse button sets the starting point for the line.
 * Dragging it moves the other endpoint and releasing the mouse
 * fixes the line in its position and gets ready to start
 * a new line.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class DrawLines extends GraphicsProgram {
	
	public void run() {
		addMouseListeners();
	}
	
// Called on mouse press to create a new line
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	
// Called on mouse drag to reset the endpoint
	public void mouseDragged(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x, y);
	}
	
// Private instance variables
	private GLine line;
}