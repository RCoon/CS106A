/*
* File: AreaOfCircle.java
* ------------------------------
* This program computes the area of a circle given the radius.
*/

import acm.program.*;
import java.text.DecimalFormat;

public class AreaOfCircle extends ConsoleProgram {
	public void run() {
		println("This program computes the area of a circle.");
		double radius = readDouble("Enter the radius: ");
		double area = (radius * radius) * PI;
		DecimalFormat df = new DecimalFormat("#.##");
		area = Double.valueOf(df.format(area));
		println("The area of the circle is " + area);
	}
	private static final double PI = 3.1415926535;
}