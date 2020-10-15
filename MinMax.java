/*
 * Program: Min-Max (Integers)
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class MinMax {
	
	// The main method
	public static void main(String[] args) {
		
		// Declare variables for current number and min-max values
		int cur, max = 0, min = 0;

		// Flag for first integer
		boolean isFirst = true;

		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);

		// Display instructive message
		System.out.println("Enter a sequence of positive integers to find its min and max values: ");

		// Request user input till it's a negative integer
		while (true) {

			try {
				// Read user input and parse it into an integer
				cur = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {

				// If input is not a valid integer
				System.out.println("Wrong input. Please try again.");
				continue;				
			}

			// Check for negative integer
			if (cur < 0) {
				break;
			}

			// Check for first integer
			if (isFirst) {

				// Assume first integer to be both min and max
				min = max = cur;

				// Mark first integer as done
				isFirst = false;

			} else {

				// Update min and max values
				max = cur > max ? cur : max;
				min = cur < min ? cur : min;

			}

		}

		// Close input stream
		input.close();

		// Display response message
		System.out.println("Min: " + min + "\nMax: " + max);
	}

}
