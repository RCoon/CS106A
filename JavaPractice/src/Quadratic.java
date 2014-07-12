/*
 *  File: Quadratic.java
 *  --------------------
 *  This program accepts values for a, b, and c and
 *  calculates two solutions for the standard quadratic
 *  equation axSq + bx + c = 0.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {
	public void run() {
		println("Enter coefficients for the quadratic equation: ");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		double test = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(test);
		double solution1 = ((-b) + sqrt) / (2 * a);
		double solution2 = ((-b) - sqrt) / (2 * a);
	
		if (test < 0) {
			println("The equation has no real solutions");
		} else {
			println("The first solution is " + (int)solution1);
			println("The second solution is " + (int)solution2);
		}
	}
}
