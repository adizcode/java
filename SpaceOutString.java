/*
 * Program: Space Out String
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class SpaceOutString {

	// The main method
	public static void main(String[] args) {

		// Display instructive message
		System.out.println("Enter a String to space it out: ");

		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);

		// Read user input
		String str = input.nextLine();

		// Close input stream
		input.close();

		// Print each character of input string appended with a space
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
