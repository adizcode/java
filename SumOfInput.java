/*
 * Program: SumOfInput(>100)
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class SumOfInput {
	
	// The main method
	public static void main(String[] args) {
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Initialize sum variable
		int sum = 0;
		
		// Display instructive message
		System.out.println("Keep entering integers till their sum exceeds 100");
		
		// Request user input till total sum exceeds 100
		do {
			// Create temporary variable
			int temp = 0;
			
			// Display value of sum before new input
			System.out.print("\nSum = " + sum + " + ");
			
			// Read user input and parse it into an integer
			try {
				
				temp = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is non-integer, skip to next iteration
				System.out.println("\nWrong input. Please try again.");
				continue;
				
			}
			
			// Add new input to sum
			sum += temp;
			
			// Display value of sum after new input
			System.out.println("\nSum = " + sum);
			
		} while (sum < 101);
		
		// Close input stream
		input.close();
		
		// Display response message
		System.out.println("Done");
	}

}
