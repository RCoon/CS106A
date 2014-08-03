/*
 * File: Valentine.java
 * --------------------
 * This program draws a filled red heart as a GCompound whose origin
 * is the center of the square.
 */

import acm.program.*;
import acm.graphics.*;

public class Valentine extends GraphicsProgram {
	
	public void run() {
		double r = HEART_RADIUS;  
        double root2 = Math.sqrt(2);  
        double cx = getWidth() / 2;  
        double cy = getHeight() / 2;  
        double dx = r / root2;  
        double height = 3 * dx + r;  
        double top = cy - height / 2;  
        double bottom = cy + height / 2; 
		GPolygon heart = new GPolygon();
			heart.addVertex(0, height / 2);
			heart.addVertex(-(cx - (dx / root2)), 0);
			heart.addVertex(0, - (height / 2));
			heart.addVertex(cx - (dx / root2), 0);
			add(new GArc(cx - dx - r, top, 2 * r, 2 * r, 45, 180));  
			add(new GArc(cx + dx - r, top, 2 * r, 2 * r, -45, 180)); 
		add(heart);
		heart.setLocation(cx, cy);
	}
// Private constants
	private static final double HEART_RADIUS = 100;
}
