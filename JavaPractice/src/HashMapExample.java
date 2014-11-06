/*
 * File: HashMapExample.java
 * -------------------------
 * Example of a HashMap
 */

import acm.program.*;
import java.util.*;

public class HashMapExample extends ConsoleProgram {

	public void run() {
		setFont("Courier-24");
		
		println("Reading in phone numbers");
		readPhoneNumbers();
		
		println("Looking up phone numbers");
		lookUpNumbers();
		
		println("Displaying phone numbers");
		displayAllNumbers();
	}
	
	private void readPhoneNumbers() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			int number = readInt("Phone number (as int): ");
			phonebook.put(name, number);
		}
	}
	
	private void lookUpNumbers() {
		while (true) {
			String name = readLine("Enter name to lookup: ");
			if (name.equals("")) break;
			Integer number = phonebook.get(name);
			if (number == null) {
				println(name + " not in phonebook");
			} else {
				println(number);
			}
		}
	}
	
	private void displayAllNumbers() {
		Iterator<String> it = phonebook.keySet().iterator();
		while (it.hasNext()) {
			String name = it.next();
			Integer number = phonebook.get(name);
			println(name + ": " + number);
		}
	}
	
	private void displayAllNumbers2() {
		for (String name: phonebook.keySet()) {
			Integer number = phonebook.get(name);
			println(name + ": " + number);
		}
	}
	
	/*Private instance variable */
	private Map<String,Integer> phonebook = new HashMap<String,Integer>();
}
