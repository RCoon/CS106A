/*
 * File: AvgRemoveHiLow.java
 * -------------------------
 * This program reads in the scores from a panel of 7 judges and then
 * computes the average of the five scores that remain after discarding
 * the highest and lowest.
 */

import acm.program.*;

public class AvgRemoveHiLow extends ConsoleProgram {
	
	public void run() {
		println("This program takes 7 scores and returns");
		println("the average after discarding the highest and lowest.");
		double largestScore = -1;
		double smallestScore = 100;
		double total = 0;
		double[] scores = new double[7];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = readDouble("Enter score: ");
			total += scores[i];
			if (scores[i] > largestScore) {
				largestScore = scores[i];
			} else if (scores[i] < largestScore && scores[i] <= smallestScore) {
				smallestScore = scores[i];
			}
		}
		double average = (total - (largestScore + smallestScore)) / (scores.length - 2);
		println("The average is " + average);
	}

}
