/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

//import acm.util.*;
import java.io.*;
import java.util.*;

public class HangmanLexicon {

/** Constructs a new HangmanLexicon */
	public HangmanLexicon() {
		//wordCount = 0;
		strList = new ArrayList<String>();
		try {
		BufferedReader rd = new BufferedReader(new FileReader("HangmanLexicon.txt"));
		while (true) {
			String line = rd.readLine();
			if (line == null) break;
			strList.add(line);
			// wordCount++;
		}
		rd.close();
		} catch (IOException ex) {
			System.out.println("Word list file doesn't exist.");
		}
	}
	
	/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return strList.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		return strList.get(index);
	}
	
// Instance variables
	// private int wordCount;
	private ArrayList<String> strList;
}