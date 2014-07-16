/*
 *  File: SolveMaze.java
 *  --------------------
 *  This program uses the solveMaze method in a program
 *  designed for a robot Theseus to escape a maze with
 *  no internal loops.
 

import acm.program.*;

public class SolveMaze extends ConsoleProgram {
	
	private void solveMaze {
		while (!isOutside()) {
			moveForward();
			turnRight();
			if (isFacingWall()) {
				turnLeft();
			}
		}
	}

}
*/
