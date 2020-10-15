/*
 * Program: Sum Of Strict Divisors
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class SumOfStrictDivisors {
	
	// The main method
	public static void main(String[] args) {
		
		// Initialize number and sum variables to value of 0
		int num, sum;
		num = sum = 0;
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Request user input till it's a valid positive integer other than 0
		do {
			
			// Display instructive message
			System.out.println("Enter a positive integer other than 0: ");
			
			try {
				
				// Read user input and parse it into an integer
				num = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer
				System.out.println("Wrong input. Please try again.");
				
			}
			
		} while (! (num > 0));
		
		
		// Format output properly
		System.out.print(num + " -> ");
		
		
		// Compute strict divisors of input number
		for (int i = 2; i <= num/2; i++) {
			
			// Check if i divides number
			if (num % i == 0) {
				
				// Format output properly
				if (sum != 0) {
					System.out.print(" + ");
				}
				
				// Add i to sum
				sum += i;
				
				// Print i
				System.out.print(i);
			}
		}
		
		// Print total sum of all strict divisors of input number
		System.out.print(" = " + sum);
		
		// Close input stream
		input.close();
		
	}

}
