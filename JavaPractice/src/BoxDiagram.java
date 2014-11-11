/*
 * File: BoxDiagram.java
 * ---------------------
 * This program allows the user to arrange boxes with labels on the window.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BoxDiagram extends GraphicsProgram {

/* Initializes the program */
	public void init() {
		boxes = new HashMap<String, GCompound>();
		this.setSize(600, 300);
		
		boxName = new JTextField(10);
		add(new JLabel("Name"), SOUTH);
		add(boxName, SOUTH);
		boxName.addActionListener(this);
		
		add(new JButton("Add"), SOUTH);
		add(new JButton("Remove"), SOUTH);
		add(new JButton("Clear"), SOUTH);
		
		addActionListeners();
		addMouseListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Add")) {
			createLabeledRectangle();
		} else if (cmd.equals("Remove")) {
			removeLabeledRectangle();
		} else if (cmd.equals("Clear")) {
			removeAllBoxes();
		}
	}
	
	private GCompound createLabeledRectangle() {
		double x = getWidth() / 2.0;
		double y = getHeight() / 2.0;
		double x1 = x - BOX_WIDTH / 2.0;
		double y1 = y - BOX_HEIGHT / 2.0;
		String boxLabel = boxName.getText();
		GCompound labeledBox = new GCompound();
		GRect rect = new GRect(x1, y1, BOX_WIDTH, BOX_HEIGHT);
		labeledBox.add(rect);
		GLabel label = new GLabel(boxLabel, x1, y1);
		labeledBox.add(label);
		add(labeledBox);
		double x2 = label.getWidth() / 2.0;
		double y2 = label.getAscent() / 2.0;
		label.move(BOX_WIDTH / 2.0 - x2, BOX_HEIGHT / 2.0 + y2);
		boxes.put(boxLabel, labeledBox);
		return labeledBox;
	}
	
	private void removeLabeledRectangle() {
		String boxLabel = boxName.getText();
		GCompound box = boxes.get(boxLabel);
		boxes.remove(boxLabel);
		remove(box);
	}
	
	private void removeAllBoxes() {
		Iterator<String> it = boxes.keySet().iterator();
		while (it.hasNext()) {
			removeBox(it.next());
		}
		boxes.clear();  // Clear all entries in the hashmap
	}
	
/* Removes the box with the given name */
	private void removeBox(String name) {
		GObject obj = boxes.get(name);
		if (obj != null) {
			remove(obj);
		}
	}
	
/** Called on mouse press to record the coordinates of the click */
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		lastY = e.getY();
		gobj = getElementAt(lastX, lastY);
	}
	
/** Called on mouse drag to reposition the object */
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - lastX, e.getY() - lastY);
			lastX = e.getX();
			lastY = e.getY();
		}
	}
	
/** Called on mouse click to move this object to the front */
	public void mouseClicked(MouseEvent e) {
		if (gobj != null) gobj.sendToFront();
	}
	
	/* Constants */
	private static final double BOX_WIDTH = 120;
	private static final double BOX_HEIGHT = 50;
	
	/* Private instance variables */
	private JTextField boxName;
	private GObject gobj; // The object being dragged
	private double lastX; // The last mouse X position
	private double lastY; // The last mouse Y position
	private Map<String,GCompound> boxes = new HashMap<String,GCompound>();
}
