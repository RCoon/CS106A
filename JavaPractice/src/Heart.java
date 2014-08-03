/*
 * File: Heart.java
 * ----------------
 * This program draws a heart centered in the screen window.
 */

import acm.program.*;
import acm.graphics.*;

public class Heart extends GraphicsProgram {
	
	public void run() {
		double r = HEART_RADIUS;  
        double root2 = Math.sqrt(2);  
        double cx = getWidth() / 2;  
        double cy = getHeight() / 2;  
        double dx = r / root2;  
        double height = 3 * dx + r;  
        double top = cy - height / 2;  
        double bottom = cy + height / 2;  
        add(new GArc(cx - dx - r, top, 2 * r, 2 * r, 45, 180));  
        add(new GArc(cx + dx - r, top, 2 * r, 2 * r, -45, 180));  
        add(new GLine(cx, bottom, cx - 2 * dx, bottom - 2 * dx));  
        add(new GLine(cx, bottom, cx + 2 * dx, bottom - 2 * dx));  
	}
// Private constants
	private static final double HEART_RADIUS = 100;
}
