/*
* File: DrawSnowman.java
* --------------------
* This program draws a simple snowman diagram in the window. Its
* programming style leaves much to be desired, mostly because
* the coordinate values are specified explicitly and not defined
* so that they automatically adjust according to specified
* parameters of the image as a whole. You will learn how to
* improve the style in Chapter 7.
*/
import acm.graphics.*;
import acm.program.*;

public class DrawSnowman extends GraphicsProgram {
	public void run() {
		GOval head = new GOval(120, 20, 50, 50);
		GOval rEye = new GOval(130, 30, 10, 10);
		GOval lEye = new GOval(150, 30, 10, 10);
		GLabel nose = new GLabel("v", 142, 50);
		GOval mouth = new GOval(138, 52, 13, 13);
		GOval chest = new GOval(105, 70, 80, 80);
		GRect button1 = new GRect(138, 80, 13, 13);
		GRect button2 = new GRect(138, 100, 13, 13);
		GRect button3 = new GRect(138, 120, 13, 13);
		GOval bottom = new GOval(95, 150, 100, 100);
		add(head);
		add(rEye);
		add(lEye);
		add(nose);
		add(mouth);
		add(chest);
		add(button1);
		add(button2);
		add(button3);
		add(bottom);
	}
}