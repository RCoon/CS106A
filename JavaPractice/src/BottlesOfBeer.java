/*
* File: BottlesOfBeer.java
* -----------------------
* This program generates the lyrics to this song.
*/

import acm.program.*;

public class BottlesOfBeer extends ConsoleProgram {
	public void run() {
		println("This program will generate lyrics to the bottles of beer song.");
		int numBeers = readInt("How many bottles of beer are on the wall? ");
		for (int i = numBeers; i > 1; i--) {
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around.");
		}
		println("1 bottle of beer on the wall.\n1 bottle of beer.");
		println("You take it down, pass it around.");
		println("Then you vomit and slide into a coma.");
	}

}
