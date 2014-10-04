/*
 * File: TokenizerExample.java
 * ---------------------------
 * An example of a tokenizer
 */

import java.util.StringTokenizer;

import acm.program.*;
import acm.util.*;

public class TokenizerExample extends ConsoleProgram {
	
	private void printTokens(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		for (int count = 0; tokenizer.hasMoreTokens(); count++) {
			println("Token #" + count + ": " + tokenizer.nextToken());
		}
	}

	public void run() {
		setFont("Times New Roman-24");
		String line = readLine("Enter line to tokenize: ");
		println("The tokens of the string are: ");
		printTokens(line);
	}
}
