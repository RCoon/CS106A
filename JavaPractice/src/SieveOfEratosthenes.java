/*
 * File: SieveOfEratosthenes.java
 * ------------------------------
 * This program generates a list of primes using the sieve
 * of Eratosthenes algorithm.
 */

import acm.program.*;

public class SieveOfEratosthenes extends ConsoleProgram {
	
	public void run() {
		boolean[] primes = new boolean[MAX_NUM];
		
		int j = 0;
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}
		
		for (int x = 2; x < primes.length; x++) {
			j = x;
			for (int n = 2; j < primes.length; n++) {
				j = n * x;
				if (j < primes.length) {
					primes[j] = false;
				}
			}
		}
		
		for (int k = 0; k < primes.length; k++) {
			if (primes[k]) {
				println(k);
			}
		}
	}

	private static final int MAX_NUM = 1000;
	
}