/*
 * File: Hailstone.java
 * --------------------
 * This program is a stub for the Hailstone problem, which computes
 * Hailstone sequence described in Assignment #2.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter a number: ");
		int counter = 0;
		while (n > 1){
			if (n % 2 == 1){
				int odd = (n*3+1);
				println(n + " is odd, so I make 3n + 1: " + odd + "");
				n = odd;
			}
		else {
				int even = (n/2);
				println(n + " is even so I take half: " + even + "");
				n = even;
			}
			counter = counter + 1;
		}
		println("This process took " + counter + " to reach 1");
	}
}
