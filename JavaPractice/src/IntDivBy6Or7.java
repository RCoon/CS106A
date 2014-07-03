/* File: IntDivBy6Or7.java
*  -------------------------
*  This program displays the integers between 1 and 100
*  that are divisible by either 6 or 7.
*/

import acm.program.*;

public class IntDivBy6Or7 extends ConsoleProgram {
    public void run() {
        println("This program displays the integers between 1 and 100");
        println("that are divisible by either 6 or 7.");

        for(int i = 1; i <= 100; i++) {
            if((i % DIVBY6 == 0) || (i % DIVBY7 == 0)) {
                println(i);
            }    
        }
    }
    private static final int DIVBY6 = 6;
    private static final int DIVBY7 = 7;
}