/*
 * File: WordCount.java
 * --------------------
 * This program reads a file and reports how many lines, words, and
 * characters appear in it.
 */

import acm.program.*;
import acm.util.*;
import java.io.*;

public class WordCount extends ConsoleProgram {
	
	private BufferedReader openFile(String prompt) {
		BufferedReader rd = null;
		
		while (rd == null) {
			try {
				String filename = readLine(prompt);
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				println("That file does not exist.");
			}
		}
		return rd;
	}
	
	public void run() {
		BufferedReader rd = openFile("File: ");
		
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lineCount++;
				charCount += line.length();
				for (int i = 0; i < line.length(); i++) {
					if (!Character.isLetterOrDigit(line.charAt(i)) && Character.isWhitespace(line.charAt(i))) {
						wordCount++;
					}
				}
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
		
		println("Lines = " + lineCount);
		println("Words = " + (wordCount + lineCount));
		println("Chars = " + charCount);
	}

// Instance variables
	private int lineCount = 0;
	private int wordCount = 0;
	private int charCount = 0;
	
}