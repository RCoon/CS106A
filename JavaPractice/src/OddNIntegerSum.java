/* File: OddNIntegerSum.java
*  -------------------------
*  This program reads in a positive integer N and then displays
*  the sum of the first N odd integers.
*/

import acm.program.*;

public class OddNIntegerSum extends ConsoleProgram {
    public void run() {
        println("This program reads in a positive integer N and then displays");
        println("the sum of the first N odd integers.");
        
        int posInt = readInt("Enter a positive integer: ");

        int sum = 0;

        for(int i = 1; i < posInt * 2; i++) {
            if((i % 2) == 1) {
                sum = sum + i;
            }    
        }
    println("The sum is: " + sum);
    }
}