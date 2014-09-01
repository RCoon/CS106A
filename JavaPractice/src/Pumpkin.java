/* 
 * File: Pumpkin.java
 * ------------------
 * This program draws a filled Orange pumpkin with shapes
 * for the eyes, nose, and mouth.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Pumpkin extends GraphicsProgram {
	
	Color pumpkin = new Color(255, 153, 0);
	
	public void run() {
		drawFace();
		drawLeftEye();
		drawRightEye();
		drawNose();
		drawMouth();
		drawStem();
	}
	
	private GOval drawFace() {
		double x = (getWidth() / 2) - (FACE_WIDTH / 2);
		double y = (getHeight() / 2) - (FACE_HEIGHT / 2);
		head = new GOval(FACE_WIDTH, FACE_HEIGHT);
		add(head, x, y);
		head.setFilled(true);
		head.setFillColor(pumpkin);
		head.setColor(pumpkin);
		return head;
	}
	
	private GPolygon drawLeftEye() {
		double x = (getWidth() / 2) - (EYE_WIDTH * 2.5);
		double y = (getHeight() / 2) - (EYE_HEIGHT * 3);
		leftEye = new GPolygon(x, y);
		leftEye.addVertex(-EYE_WIDTH, -EYE_HEIGHT);
		leftEye.addVertex(EYE_WIDTH, -EYE_HEIGHT);
		leftEye.addVertex(0, EYE_HEIGHT);
		add(leftEye);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.BLACK);
		return leftEye;
	}
	
	private GPolygon drawRightEye() {
		double x = (getWidth() / 2) + (EYE_WIDTH * 2.5);
		double y = (getHeight() / 2) - (EYE_HEIGHT * 3);
		rightEye = new GPolygon(x, y);
		rightEye.addVertex(-EYE_WIDTH, -EYE_HEIGHT);
		rightEye.addVertex(EYE_WIDTH, -EYE_HEIGHT);
		rightEye.addVertex(0, EYE_HEIGHT);
		add(rightEye);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.BLACK);
		return rightEye;
	}
	
	private GPolygon drawNose() {
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		nose = new GPolygon(x, y);
		nose.addVertex(-NOSE_WIDTH, NOSE_HEIGHT);
		nose.addVertex(NOSE_WIDTH, NOSE_HEIGHT);
		nose.addVertex(0, -NOSE_HEIGHT);
		add(nose);
		nose.setFilled(true);
		nose.setFillColor(Color.BLACK);
		return nose;
	}
	
	private GPolygon drawMouth() {
		double x = getWidth() / 2;
		double y = (getHeight() / 2) + (MOUTH_HEIGHT * 2.25);
		double r = MOUTH_HEIGHT / 2;
		mouth = new GPolygon(x, y);
		mouth.addVertex(0, -MOUTH_HEIGHT);
		mouth.addPolarEdge(r, -45);
		mouth.addPolarEdge(r, 45);
		mouth.addPolarEdge(r, -45);
		mouth.addPolarEdge(r, 45);
		mouth.addPolarEdge(r, -45);
		mouth.addPolarEdge(2 * r, -135);
		mouth.addPolarEdge(r, -225);
		mouth.addPolarEdge(r, -135);
		mouth.addPolarEdge(r, -225);
		mouth.addPolarEdge(r, -135);
		mouth.addPolarEdge(r, -225);
		mouth.addPolarEdge(r, -135);
		mouth.addPolarEdge(2 * r, -225);
		mouth.addPolarEdge(r, 45);
		mouth.addPolarEdge(r, -45);
		mouth.addPolarEdge(r, 45);
		mouth.addPolarEdge(r, -45);
		mouth.addPolarEdge(r, 45);
		add(mouth);
		mouth.setFilled(true);
		mouth.setFillColor(Color.BLACK);		
		return mouth;
	}
	
	private GRect drawStem() {
		double x = (getWidth() / 2) - (STEM_WIDTH / 2);
		double y = (getHeight() / 2) - (FACE_HEIGHT / 2) - STEM_HEIGHT;
		stem = new GRect(x, y, STEM_WIDTH, STEM_HEIGHT);
		add(stem);
		stem.setFilled(true);
		stem.setFillColor(Color.BLACK);
		return stem;
	}

// Private constants specifying feature size as a fraction of the head size
	private static final double FACE_WIDTH = 300;
	private static final double FACE_HEIGHT = 300;
	private static final double EYE_WIDTH = 0.07 * FACE_WIDTH;
	private static final double EYE_HEIGHT = 0.07 * FACE_HEIGHT;
	private static final double NOSE_WIDTH = 0.07 * FACE_WIDTH;
	private static final double NOSE_HEIGHT = 0.07 * FACE_HEIGHT;
	// private static final double MOUTH_WIDTH = 0.50 * FACE_WIDTH;
	private static final double MOUTH_HEIGHT = 0.15 * FACE_HEIGHT;
	private static final double STEM_WIDTH = 0.075 * FACE_WIDTH;
	private static final double STEM_HEIGHT = 0.075 * FACE_HEIGHT;
	
// Instance variables
	private GOval head;
	private GPolygon leftEye, rightEye;
	private GPolygon nose;
	private GPolygon mouth;
	private GRect stem;
}
