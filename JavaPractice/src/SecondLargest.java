/*
 * File: SecondLargest.java
 * --------------------
 * This program finds the largest and second largest
 * in a list of integers entered by the user
 * and stops with a sentinel value of 0.
 */

import acm.program.*;

public class SecondLargest extends ConsoleProgram {

    private static final int SENTINEL = 0;

    public void run() {
        println("This program finds the two largest integers in a list.  Enter values, " +
        		"one per line, using 0 to signal the end of the list.");
        int Firstnumber=readInt(" ? ");
        if (Firstnumber==SENTINEL){
            println("No values have been entered.");
        }
        else{

            int largestNumber= Firstnumber;
            int secondLargestNumber= 0;
            while (true) {
                int number = readInt(" ? ");        
                if (number == SENTINEL) break; 
                if (number >= largestNumber){
                largestNumber=number;
                }
                if (number <= largestNumber && number >= secondLargestNumber){
                    secondLargestNumber = number;
                }                
        }
        println("The largest value is " + largestNumber );
        println("The second largest is " + secondLargestNumber );    
        }
    }
}