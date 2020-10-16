/*
 * Program: Reverse String
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class ReverseString {

	// The main method
	public static void main(String[] args) {

		// Display instructive message
		System.out.print("Enter a String to reverse it: ");

		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);

		// Read user input
		String str = input.nextLine();

		// Close input stream
		input.close();

		// Display string in reverse
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
