/*
 *  File: PascalTriangle.java
 *  -------------------------
 *  This program displays the first eight rows of Pascal's Triangle.
 */

import acm.program.*;
import acm.graphics.*;

public class PascalTriangle extends GraphicsProgram {
	private static final int MIN_NUM = 0;
	private static final int MAX_NUM = 8;
	private static final int UNIT_LENGTH = 30;
	
	public void run() {
		int middle = getHeight() * 2 / 3;
		for (int i = MIN_NUM; i < MAX_NUM; i++) {
			for (int j = MIN_NUM; j <= i; j++) {
				add(new GLabel("" + combinations(i, j)), middle + (2 * j - i) * UNIT_LENGTH, (i + 1) * UNIT_LENGTH);
			}
		}
	}
	/*
	 *  Returns the mathematical combinations function C(n, k),
	 *  which is the number of ways of selecting k objects
	 *  from a set of n distinct objects.
	 */
		private int combinations(int n, int k) {
			return factorial(n) / (factorial(k) * factorial(n - k));
		}
		
	/*
	 *  Returns the factorial of n, which is defined as the
	 *  product of all integers from 1 up to n.
	 */
		private int factorial(int n) {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
}
