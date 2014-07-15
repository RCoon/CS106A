/* 
 *  File: YesNoExample.java
 *  This program asks the user a question and then
 *  waits for a response.  
 */

import acm.program.*;

public class YesNoExample extends ConsoleProgram {

	public void run() {
		String question = "Would you like instructions? ";
		if (askYesNoQuestion(question)) {
			println("Here are your instructions.");
		} else {
			println("Good luck.");
		}
	}
	
	private boolean askYesNoQuestion(String str) {
		String answer = readLine(str);
		while ( !answer.equals("yes") && !answer.equals("no")) {
			println("Please answer yes or no.");
			answer = readLine(str);
		}
		return (answer.equals("yes"));
	}
}
