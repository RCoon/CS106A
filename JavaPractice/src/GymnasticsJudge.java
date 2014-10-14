/*
 * File: GymasticsJudge.java
 * -------------------------
 * This program reads in an array of scores and computes the average.
 */

import acm.program.*;

public class GymnasticsJudge extends ConsoleProgram {
	
/** Runs the program */
	public void run() {
		int nJudges = readInt("Enter the number of judges: ");
		double[] scores = new double[nJudges];
		for (int i = 0; i < nJudges; i++) {
			scores[i] = readDouble("Enter the score for judge " + i + ": ");
		}
		double total = 0;
		for (int i = 0; i < nJudges; i++) {
			total += scores[i];
		}
		double averageScore = total / nJudges;
		println("The average score is " + averageScore);
		println("The mean score is " + mean(scores));
		println("The standard deviation is " + (String.format("%1.2f", stdev(scores))));
	}
	
	private double mean(double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double meanAverage = total / array.length;
		return meanAverage;
	}
	
	private double stdev(double[] array) {
		double sigma = 0;
		for (int i = 0; i < array.length; i++) {
			sigma += (Math.pow((mean(array) - array[i]), 2));
		}
		double stdev = Math.sqrt(sigma / (array.length - 1));
		return stdev;
	}
}
