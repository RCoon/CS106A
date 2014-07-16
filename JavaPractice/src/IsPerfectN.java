/*
 *  File: IsPerfectN.java
 *  ---------------------
 *  This program uses the isPerfect method to check for perfect
 *  numbers in the range of 1 to 9999.
 */

import acm.program.*;

public class IsPerfectN extends ConsoleProgram {
	
	private static final int MIN_RANGE = 1;
	private static final int MAX_RANGE = 9999;
	
	public void run() {
		for (int i = MIN_RANGE; i <= MAX_RANGE; i++) {
			if (isPerfect(i)) {
				println(i + " is a perfect number.");
			}
		}
	}
	
	private boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

}
