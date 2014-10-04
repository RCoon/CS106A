/*
 * File: GCTest.java
 * -----------------
 * This program allocates 10000 Rational objects without saving any of them in variables
 * so they all become garbage.  It measures the amount of free memory before and after
 * garbage collection and reports how many bytes were freed.
 */

import acm.program.*;

public class GCTest extends ConsoleProgram {
	
	public void run() {
		println("Allocating 10000 Rational objects");
		for (int i = 0; i < 10000; i++) {
			new Rational();
		}
		long memBefore = myRuntime.freeMemory();
		myRuntime.gc();
		long memAfter = myRuntime.freeMemory();
		println("Garbage collection freed " + (memAfter - memBefore) + " bytes");
	}
	
// Instance variables
	Runtime myRuntime = Runtime.getRuntime();
}
