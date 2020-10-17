/*
 * Program: Prime Numbers Between (2 Integers)
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class PrimeNumbersBetween {

	// Main method
	public static void main(String[] args) {

		// Declare integer variables
		MutableInteger num1 = new MutableInteger();
		MutableInteger num2 = new MutableInteger();

		// Call method to request user input and save it in num1 and num2
		requestInput(num1, num2);

		// Print all prime numbers between num1 and num2
		printPrimeBetween(num1.value, num2.value);
	}

	// Method to request user input
	public static void requestInput(MutableInteger one, MutableInteger two) {

		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);

		// Request user input till both numbers are valid positive integers, and num1 < num2
		do {

			// Display instructive message
			System.out.println("\nEnter two positive integers to find prime numbers between them: ");

			// Read user input and parse it into integers
			try {
				System.out.print("Number 1: ");
				one.value = Integer.parseInt(input.next());

				System.out.print("Number 2: ");
				two.value = Integer.parseInt(input.next());

				// Display warning message
				if (one.value >= two.value) {
					System.out.println("\nFirst integer must be smaller than second integer!");

					// Reset both numbers and request for input again
					one.value = two.value = 0;
				}

			} catch (NumberFormatException e) {

				// If user input are not valid integers
				System.out.println("\nWrong input. Please try again.");

				// Reset both numbers and request for input again
				one.value = two.value = 0;
			}

		} while (one.value < 1 || two.value < 1);
	}

	// Method to print prime numbers between two integers
	public static void printPrimeBetween(int num1, int num2) {

		// Traverse over every integer between the two numbers
		for (int i = num1 + 1; i < num2; i++) {

			// Check for prime number
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	// Method to check if an integer is a prime number or not
	public static boolean isPrime(int num) {

		// Assume number is prime unless proven otherwise
		boolean isPrime = true;

		// Look for trivial divisors of number
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				// Mark number as composite and end loop
				isPrime = false;
				break;
			}
		}

		// Return true if number is prime, otherwise false
		return isPrime;	
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
