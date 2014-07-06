/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem,
 * which finds the smallest and
 * largest values in a list of integers.
 */

import acm.program.*;

public class FindRange1 extends ConsoleProgram {

    /* FindRange finds the smallest and the largest
     * in a list of integers entered by the user
     * and stops with a sentinel value of 0.
     */
    private static final int SENTINEL = 0;

    public void run() {
        println("This program finds the largest and smallest numbers.");
        int Firstnumber=readInt("?");
        if (Firstnumber==SENTINEL){
            println("No values have been entered.");
        }
        else{

            int largestNumber= Firstnumber;
            int smallestNumber= Firstnumber;
            while (true) {
                int number = readInt("? ");        
                if (number == SENTINEL) break;
                if (number != 0 && number<=smallestNumber){
                smallestNumber = number;
                }    
                if (number>=largestNumber){
                largestNumber=number;
            }             
        }
        // println("This program finds the largest and smallest numbers.");
        println("Largest: " + largestNumber );
        println("Smallest: " + smallestNumber );    
        }
    }
}