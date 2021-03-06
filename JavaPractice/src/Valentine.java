/*
 * File: Valentine.java
 * --------------------
 * This program draws a filled red heart as a GCompound whose origin
 * is the center of the square.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

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
		GCompound valentine = new GCompound();
			GPolygon heart = new GPolygon();
					heart.addVertex(0, height / 2);
					heart.addVertex(-(cx - (dx / root2)), 0);
					heart.addVertex(0, - (height / 2.3));
					heart.addVertex(cx - (dx / root2), 0);
					add(heart);
					heart.setFilled(true);
					heart.setColor(Color.RED);
			GArc left = new GArc(cx - dx - r, top, 2 * r, 2 * r, 45, 180);
			valentine.add(left);
			left.setFilled(true);
			left.setColor(Color.RED);
			GArc right = new GArc(cx + dx - r, top, 2 * r, 2 * r, -45, 180);
			valentine.add(right);
			right.setFilled(true);
			right.setColor(Color.RED);
			add(valentine);
		heart.setLocation(cx, cy);
	}
// Private constants
	private static final double HEART_RADIUS = 100;
}
