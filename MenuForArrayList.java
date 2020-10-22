/*
 * Program: Menu For Array List
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MenuForArrayList {

	// Main method
	public static void main(String[] args) {
		
		// Declare choice variable
		MutableInteger choice = new MutableInteger();
		
		// Create empty array list
		ArrayList<Integer> integers = new ArrayList<>();
		
		// Retrieve singleton instance of Scanner class
		Scanner input = MyScanner.getInstance();
		
		// Display menu until user enters 4
		while (choice.value != 4) {
			
			// Method to display menu options to user
			displayMenu();
			
			// Read user input and parse it into integer
			try {
				
				// Read user input
				choice.value = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer, ask again
				System.out.println("Please enter a valid number. (1-4)");
				continue;
			}
			
			
			// Perform function based on input
			switch (choice.value) {
			case 1:
				add(integers);
				break;
				
			case 2:
				remove(integers);
				break;
				
			case 3:
				display(integers);
				break;
				
			case 4:
				exit();
				break;
				
			default:
				// If input lies outside the range of 1-4, ask again
				System.out.println("Please enter a valid number. (1-4)");
			}
			
		}
		
		// Destroy singleton instance of Scanner class
		MyScanner.destroyInstance();
		
	}

	// Method to display menu options to user
	private static void displayMenu() {
		
		System.out.println();
		
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Display");
		System.out.println("4. Exit");
		
		System.out.println();
		
		System.out.print("Your Choice: ");
	}

	// Method to add an element to array list
	private static void add(ArrayList<Integer> integers) {
		
		// Retrieve singleton instance of Scanner class
		Scanner input = MyScanner.getInstance();

		// Create a null Integer object
		Integer num = null;

		// Request user input till num has a value
		while (num == null) {

			// Display instructive message
			System.out.print("Enter an integer: ");

			// Read user input and parse it into integer
			try {
				// Read user input
				num = Integer.parseInt(input.next());

			} catch (NumberFormatException e) {

				// If input is not a valid integer
				System.out.println("Please enter a valid integer");
			}
		}
		
		// Add entered integer to array list
		integers.add(num);
		
		// Display response message
		System.out.println("Added");
	}

	// Method to remove an element from array list
	private static void remove(ArrayList<Integer> integers) {
		
		// Retrieve singleton instance of Scanner class
		Scanner input = MyScanner.getInstance();
		
		// Create null Integer object
		Integer num = null;
		
		// Request user input till num is has a value
		while (num == null) {
			
			// Display instructive message
			System.out.print("Enter the integer to remove: ");
			
			// Read user input and parse it into integer
			try {
				// Read user input
				num = Integer.parseInt(input.next());
				
			} catch (NumberFormatException e) {
				
				// If input is not a valid integer
				System.out.println("Please enter a valid integer to remove");
			}
		}
		
		// Check whether input integer is present in array list
		if (integers.contains(num)) {
			
			// Remove input integer
			integers.remove(num);
			
			// Display response message
			System.out.println("Removed");
			
		} else {
			// If input integer is not present in array list
			System.out.println("Element not found");
		}
	}

	// Method to display the string representation of array list
	private static void display(ArrayList<Integer> integers) {
		System.out.println("Your List: " + integers);
	}

	// Method to display an exit message to user
	private static void exit() {
		System.out.println("Goodbye");
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
