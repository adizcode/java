/*
 * Program: Conditional Input
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConditionalInput {
	
	// The main method
	public static void main(String[] args) {
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Initialize variable with default value of 0
		int num = 0;
		
		// Request user input till 1 <= num <= 10
		do {
			
			// Display instructive message
			System.out.print("Please enter an integer ranging from 1-10: ");
			
			try {
				// Read user input
				num = input.nextInt();
				
			} catch (InputMismatchException e) {
				
				// Handle wrong input
				System.out.println("Incorrect input!");
				
				// Close input stream and exit program
				input.close();
				return;
				
			}
			
		} while (num < 1 || num > 10);
		
		// Close input stream
		input.close();
		
		// Display response message
		System.out.println("Thank you for your cooperation. We'll get back to you shortly.");
	}

}
