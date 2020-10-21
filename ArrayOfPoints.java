/*
 * Program: Array Of Points (1-20)
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.awt.Point;
import java.util.Scanner;

public class ArrayOfPoints {

	// Main method
	public static void main(String[] args) {
		
		// Declare size variable
		MutableInteger size = new MutableInteger();
		
		// Call method to request size of array
		requestInputSize(size);
		
		// Create array of Points of given size
		Point[] arr = new Point[size.value];
		
		// Call method to request user input to fill array
		requestArrayInput(arr);
		
		// Print contents of array
		printArray(arr);
		
		// Destroy singleton instance of Scanner class
		MyScanner.destroyInstance();
		
	}

	// Method to print contents of array
	private static void printArray(Point[] arr) {
		
		// Display contextual message
		System.out.println("The array contains: ");

		// Print respective element of array
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". (" + arr[i].x + ", " + arr[i].y + ")");
		}
		
	}

	// Method to request user input to fill array
	private static void requestArrayInput(Point[] arr) {
		
		// Retrieve singleton instance of Scanner class
		Scanner input = MyScanner.getInstance();
		
		// Loop counter
		int i = 0;
		
		// Loop through array
		while (i < arr.length) {
			
			// Declare temporary variables
			int x, y;
			
			// Read user input and parse it into integer
			try {
				System.out.print("Point " + (i + 1) + " (abscissa): ");
				x = Integer.parseInt(input.next());
				
				System.out.print("Point " + (i + 1) + " (ordinate): ");
				y = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer
				System.out.println("Wrong input. Please try again.");
				
				// Repeat iteration
				continue;
			}
			
			// Create a new Point at the respective index
			arr[i] = new Point(x, y);
			
			// Increment loop counter
			i++;
		}
		
	}

	// Method to request size of array
	private static void requestInputSize(MutableInteger size) {
		
		// Retrieve singleton instance of Scanner class
		Scanner input = MyScanner.getInstance();
		
		// Read user input till it ranges from 1-20
		do {
			
			// Display instructive message
			System.out.print("Enter size of the array (1 - 20): ");
			
			// Read user input and parse it into integer
			try {
				size.value = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer
				System.out.println("Wrong input. Please try again. ");
			}
			
		} while (size.value < 1 || size.value > 20);
		
	}
}

// Wrapper class to hold an integer: Allows passing integer by-reference to methods
class MutableInteger {
	
	// Integer value
	int value;
	
	// Parameterized constructor
	MutableInteger(int value) {
		this.value = value;
	}
	
	// Empty constructor
	MutableInteger() {
		this.value = 0;
	}
}

// Singleton class to hold a Scanner instance
class MyScanner {
	
	// Singleton instance of Scanner
	private static Scanner INSTANCE = null;
	
	// Disable default constructor
	private MyScanner() {
		
	}
	
	// Method to retrieve singleton instance of Scanner
	static Scanner getInstance() {
		
		// Create an instance if not already created
		if (INSTANCE == null) {
			INSTANCE = new Scanner(System.in);
		}
		
		return INSTANCE;
	}
	
	// Method to close singleton instance of Scanner
	static void destroyInstance() {
		INSTANCE.close();
	}
}
