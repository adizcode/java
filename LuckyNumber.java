/*
 * Program: Lucky Number
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class LuckyNumber {
	
	// The main method
	public static void main(String[] args) {
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Display instructive message
		System.out.println("Enter a 4-digit number: ");
		
		// Read input
		int number = input.nextInt();
		
		// Make sure it's a 4-digit number
		if(number < 1000 || number > 9999) {
			System.out.println("Error: Incorrect input");
			input.close();
			return;
		}
		
		// Extract each digit
		int d = number % 10;
		number /= 10;
		int c = number % 10;
		number /= 10;
		int b = number % 10;
		number /= 10;
		int a = number % 10;
		
		// Check if it's a lucky number
		if (a + b == c + d) {
			System.out.println("It's a lucky number!");
		} else {
			System.out.println("Not a lucky number... :(");
		}
		
		// Close input stream
		input.close();
		
	}

}
