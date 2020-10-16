/*
 * Program: Outlined Rectangle Pattern
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class OutlinedRectanglePattern {
	
	// Main method
	public static void main(String[] args) {
		
		// Initialize size variable with a value of 0
		int size = 0;
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Request user input till it's a positive integer other than 0
		do {
			// Display instructive message
			System.out.print("Enter size of the rectangle to be drawn: ");
			
			try {
				// Read user input
				size = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If number is not a valid integer
				System.out.println("Wrong input. Please try again.");
			}
			
		} while (size < 1);
		
		// Close input stream
		input.close();
				
		// Draw pattern row-by-row
		for (int i = 1; i <= size; i++) {
			
			// First and last row: Draw only asterisks
			if (i == 1 || i == size) {
				
				for (int j = 1; j <= size; j++) {
					System.out.print("*");
				}
				
			} else {
				
				// Middle rows
				for (int j = 1; j <= size; j++) {
					
					// Draw asterisk at edges
					if (j == 1 || j == size) {
						
						System.out.print("*");
						
					} else {
						
						// Draw spaces in-between
						System.out.print(" ");
					}
				}
			}
			
			// Move over to next row
			System.out.println();
		}
	}
}
