/*
 * Ignoring punctuation and spaces, determine whether a sentence is a palindrome.
 */
 
import acm.program.*;
 
public class SentencePalindrome2 extends ConsoleProgram {
 
	private static final long serialVersionUID = 1L;
	String str = "";
 
	// Read in the sentence, check with the isSentencePalindrome method to see if it is a palindrome, then
	// respond accordingly to the user.
	public void run() {
		str = readLine("Enter a sentence palindrome: ");
		if (isSentencePalindrome(str)) {
			println("This is a sentence palindrome.");
		} else {
			println("This is not a sentence palindrome.");
		}
	}
 
	// Get rid of any non letters and compare the str forward and backwards.
	private boolean isSentencePalindrome(String str) {
		char ch;
		String reverse = "";
		String forward = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				forward += Character.toLowerCase(ch);
				reverse = Character.toLowerCase(ch) + reverse;
			}			
		}
		return forward.equals(reverse);
	}
}