/*
* File: StIves.java
* ------------------------------
* This program calculates the numbers of things coming
* from St. Ives in the nursery rhyme.
* As I was going to St. Ives,
* I met a man with seven wives,
* Each wife had seven sacks,
* Each sack had seven cats,
* Each cat had seven kits:
* Kits, cats, sacks, and wives,
* How many were going to St. Ives?
*/

import acm.program.*;

public class StIves extends ConsoleProgram {
	public void run() {
		int wives = 7;
		int sacks = 7;
		int cats = 7;
		int kits = 7;
		int totalkits = wives * sacks * cats * kits;
		int totalcats = wives * sacks * cats;
		int totalsacks = wives * sacks;
		int totalThings = totalkits + totalcats + totalsacks + wives;
		println("The total number of representatives coming"
				+ " from St. Ives is " + totalThings);
	}
}
