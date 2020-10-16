/*
 * Program: Outlined Triangle Pattern
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class OutlinedTrianglePattern {
	
	// Main method
	public static void main(String[] args) {
		
		// Initialize size variable with a value of 0
		int size = 0;
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Read user input till it's a positive integer other than 0
		do {
			try {		
				// Display instructive message
				System.out.print("Enter size of the triangle to be drawn (Positive integer): ");
				
				// Read user input
				size = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If number is not a valid integer
				System.out.println("Wrong input. Please try again.\n");
			}
			
		} while(size < 1);
		
		// Close input stream
		input.close();
		
		// Draw pattern row-by-row
		for (int i = 1; i <= size; i++) {
			
			// Draw pre-triangle spaces in each row
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			
			// First and last row: Draw parts of triangle only with asterisks
			if (i == 1 || i == size) {
				
				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print("*");
				}
				
			} else {
				
				// Middle rows: Draw parts of triangle with asterisks + spaces
				for (int j = 1; j <= (2 * i) - 1; j++) {
					
					// Draw asterisk at edges of triangle
					if (j == 1 || j == (2 * i) - 1) {
						
						System.out.print("*");
						
					} else {
						
						// Draw spaces between edges of triangle
						System.out.print(" ");	
					}
				}
			}
			
			// Move over to next row
			System.out.println();
		}
	}
}
