/*
* File: Countdown.java
* --------------------
* This program counts backwards from the value START
* to zero, as in the countdown preceding a rocket
* launch.
*/

import acm.program.*;

public class Countdown extends ConsoleProgram {
	
/* Specifies the value from which to start counting down */
    private static final int START = 10;
    
    /* Runs the program */
    public void run() {
    	// for (int t = START; t >= 0; t--) {
    	//	println(t);
    	int t = START;
    	while (t > 0) {
    		println(t);
    		t--;
    	}
    	println("Liftoff!");
    }
}