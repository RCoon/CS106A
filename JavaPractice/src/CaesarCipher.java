/*
 * File: CaesarCipher.java
 * -----------------------
 * This program encodes a message using a Caesar cipher.  It will take in the number
 * of character positions to shift and a message to encode, and will print out
 * the encoded message.
 */

import acm.program.*;

public class CaesarCipher extends ConsoleProgram {
	
	private static final int SENTINEL = 27;
	
	public void run() {
		println("This program encodes a message using a Caesar cipher.  Use the shift integer 27 to stop.");
		int shift = 0;
		String str;
		while (shift != SENTINEL) {
			shift = readInt("Enter the number of character positions to shift: ");
			str = readLine("Enter a message: ");
			println(encodeString(str, shift));
		}
	}

	private String encodeString(String str, int shift) {
		String message = str;
		int numShift = shift;
		//char ch;
		String result = "";
		int length = message.length();
		for (int i = 0; i < length; i++) {
			char ch = message.charAt(i);
			if (ch >= 'A' && ch <= 'Z' && ch + numShift < 65) {
				numShift += 'Z' - 'A' + 1;
				ch += numShift;
			} else if (ch >= 'A' && ch <= 'Z' && ch + numShift > 90) {
				numShift -= 'Z' - 'A' + 1;
				ch += numShift;
			} else if (ch >= 'a' && ch <= 'z' && ch + numShift < 97) {
				numShift += 'z' - 'a' + 1;
				ch += numShift;
			} else if (ch >= 'a' && ch <= 'z' && ch + numShift > 122) {
				numShift -= 'z' - 'a' + 1;
				ch += numShift;
			} else if (!Character.isLetter(ch)) {
				// Keep non-letter characters the same
			} else {
				ch += numShift;
			}
			result += ch;
		}
		return result;
	}
	
}
