/*
 * File: MyIndexOf.java
 * --------------------
 * This program creates a new indexOf method from the 
 * String class.
 */

import acm.program.*;

public class MyIndexOf extends ConsoleProgram {
	
	public void run() {
		String str = readLine("Enter a string: ");
		String test = readLine("Enter a test string: ");
		println(myIndexOf(str, test));
	}

	private int myIndexOf(String str, String test) {
		String search = test;
		String source = str;
		for (int i = 0; i < source.length(); i++) {
			for (int j = 0; j < search.length(); j++) {
				if (source.charAt(i) == search.charAt(j)) {
					String subtest = source.substring(i, i + search.length());
					if (subtest.equals(search)) {
						return i;
					}
				} 
			}
		}
	return -1;	
	}
}
