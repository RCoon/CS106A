/*
* File: ThisOldMan.java
* -----------------------
* This program generates the lyrics to this song.
*/

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {
	public void run() {
		println("This program generates the lyrics to \"This Old Man\".");
		
		String verse2 = "He played knick-knack on my";  // Stores the second verse to use with the switch
		
		for (int i = 1; i <= 10; i++) {
			println("This old man, he played " + i + ".");
			switch (i) {
			case 2: println(verse2 + " shoe."); break;
			case 3: println(verse2 + " knee."); break;
			case 4: println(verse2 + " door."); break;
			case 5: println(verse2 + " hive."); break;
			case 6: println(verse2 + " sticks."); break;
			case 7: println(verse2 + " up to heaven."); break;
			case 8: println(verse2 + " pate."); break;
			case 9: println(verse2 + " spine."); break;
			case 10: println(verse2 + " shin."); break;
			default: println(verse2 + " thumb."); break;
			}
			println("With a knick-knack, paddy-wack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
		}
	}
}
