/*
 *  File: GoldenRatio.java
 *  ----------------------
 *  This program displays the value of the mathematical
 *  constant phi = (1 + Sqrt5 / 2).
 */

import acm.program.*;

public class GoldenRatio extends ConsoleProgram {

	public void run() {
		double phi = (1 + Math.sqrt(5)) / 2;
		println("The value of phi is " + phi);
	}
}
