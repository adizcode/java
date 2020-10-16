/*
 * Program: Palindrome
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;

public class Palindrome {
	
	// The main method
	public static void main(String[] args) {
		
		// Display instructive message
		System.out.print("Enter a String to check if it's a palindrome: ");
		
		// Create Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Read user input
		String str = input.nextLine();
		
		// Close input stream
		input.close();
		
		// Assume input string to be a palindrome
		boolean isPalindrome = true;
		
		// Compare characters at corresponding distances from the middle of string
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}
		
		// Display response message
		System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
	}

}
