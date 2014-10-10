/*
 * File: ReverseArrayList.java
 * ---------------------------
 * This file reads in an array of integers and then displays those elements
 * in reverse order.  This version uses an ArrayList to allow the size of
 * the array to vary dynamically.
 */

import acm.program.*;
import java.util.*;

public class ReverseArrayList extends ConsoleProgram {
	
/** Define the sentinel value */
	private static final int SENTINEL = 0;
	
/** Runs the program */
	public void run() {
		println("This program reverses the elements in an ArrayList.");
		println("Use " + SENTINEL + " to signal the end of the list.");
		ArrayList list = readArrayList();
		reverseArrayList(list);
		printArrayList(list);
	}
	
/** Reads the data into a list */
	private ArrayList readArrayList() {
		ArrayList list = new ArrayList();
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			list.add(new Integer(value));
		}
		return list;
	}

/** Prints out the data from the list, one per line */
	private void printArrayList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			Integer valueAsInteger = (Integer) list.get(i);
			println(valueAsInteger.intValue());
		}
	}
	
/** Reverses the data in an ArrayList */
	private void reverseArrayList(ArrayList list) {
		for (int i = 0; i < list.size() / 2; i++) {
			swapElements(list, i, list.size() - i - 1);
		}
	}
	
/** Exchanges two elements in an ArrayList */
	private void swapElements(ArrayList list, int p1, int p2) {
		Object temp = list.get(p1);
		list.set(p1, list.get(p2));
		list.set(p2, temp);
	}
}