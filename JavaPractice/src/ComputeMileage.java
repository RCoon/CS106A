/*
 * File: ComputeMileage.java
 * -------------------------
 * This program uses a table of mileage data to calculate
 * the distance between US cities.
 */

import acm.program.*;

public class ComputeMileage extends ConsoleProgram {
	
/** Runs the program */
	public void run() {
		println("This program looks up intercity mileage.");
		int city1 = getCity("Enter name of city #1: ");
		int city2 = getCity("Enter name of city #2: ");
		println("The distance between " + cityNames[city1]
				+ " and " + cityNames[city2] + " is "
				+ mileageTable[city1][city2] + " miles.");
	}

/* Method: getCity */
/**
 * Prompts the user for a city name, reads in a string, and returns
 * the index corresponding to that city, if it exists.  If the city
 * name is undefined, the user is given a chance to retry.
 */
	private int getCity(String prompt) {
		int index = -1;
		while (index == -1) {
			String name = readLine(prompt);
			index = findStringInArray(name, cityNames);
			if (index == -1) {
				println("Unknown city name -- try again.");
			}
		}
		return index;
	}
	
/* Method: findStringInArray(key, array) */
/**
 * Finds the first instance of the specified key in the array
 * and returns its index. If key does not appear in the array,
 * findStringInArray return -1.
 */
	private int findStringInArray(String key, String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (key.equals(array[i])) return i;
		}
		return -1;
	}
	
	private String[] cityNames = {
			"Atlanta",
			"Boston",
			"Chicago",
			"Denver",
			"Detroit",
			"Houston",
			"Los Angeles",
			"Miami",
			"New York",
			"Philadelphia",
			"San Francisco",
			"Seattle",
			};
	
	private int[][] mileageTable = {
			{ 0,1108, 708,1430, 732, 791,2191, 663, 854, 748,2483,2625},
			{1108, 0, 994,1998, 799,1830,3017,1520, 222, 315,3128,3016},
			{ 708, 994, 0,1021, 279,1091,2048,1397, 809, 785,2173,2052},
			{1430,1998,1021, 0,1283,1034,1031,2107,1794,1739,1255,1341},
			{ 732, 799, 279,1283, 0,1276,2288,1385, 649, 609,2399,2327},
			{ 791,1830,1091,1034,1276, 0,1541,1190,1610,1511,1911,2369},
			{2191,3017,2048,1031,2288,1541, 0,2716,2794,2703, 387,1134},
			{ 663,1520,1397,2107,1385,1190,2716, 0,1334,1230,3093,3303},
			{ 854, 222, 809,1794, 649,1610,2794,1334, 0, 101,2930,2841},
			{ 748, 315, 785,1739, 609,1511,2703,1230, 101, 0,2902,2816},
			{2483,3128,2173,1255,2399,1911, 387,3093,2930,2902, 0, 810},
			{2625,3016,2052,1341,2327,2369,1134,3303,2841,2816, 810, 0},
			};
	
}