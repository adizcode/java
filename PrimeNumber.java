/*
 * Program: Prime Number
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class PrimeNumber {
	
	// The main method
	public static void main(String[] args) {
		
		// Initialize number variable
		int num = -1;
		
		// Assume number is prime until proven otherwise
		boolean isPrime = true;
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Request user input till it's a valid positive integer
		do {
			try {
				// Display instructive message
				System.out.print("Enter a positive integer: ");
				
				// Read user input and parse it into an integer
				num = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer
				System.out.println("Wrong input. Please try again.");
			}
			
		} while (num < 1);
		
		// Check if number has any trivial divisors
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {

				// Mark number as composite and end loop
				isPrime = false;
				break;
			}
		}
		
		// Close input stream
		input.close();
		
		// Display response message
		System.out.println(isPrime ? "Prime" : "Composite");
	}

}
