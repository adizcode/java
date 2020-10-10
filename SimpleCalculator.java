/*
 * Program: Simple Calculator
 * Author: adizcode a.k.a Advitiay Anand
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleCalculator {
	
	// The main method
	public static void main(String[] args) {
		
		// Declare variables for the operands and the operator
		double num1, num2;
		char operator;

		// Create a Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Output an instructive message
		System.out.println("Input format: [num1] [operator] [num2]");
		
		// Read user input
		try {
			
			num1 = input.nextDouble();
			operator = input.next().charAt(0);
			num2 = input.nextDouble();
			
		} catch (InputMismatchException e) {
			
			// Inform user of invalid input
			System.out.println("Invalid operand(s)!\nPlease enter valid numbers.");
			
			// Close input stream and exit program
			input.close();
			return;
		}
		
		// Perform computation
		switch(operator) {
		case '/':
			System.out.println("Result: " + (num1 / num2));
			break;
		case '*':
			System.out.println("Result: " + (num1 * num2));
			break;
		case '+':
			System.out.println("Result: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Result: " + (num1 - num2));
			break;
		default:
			// Inform user of invalid input
			System.out.println("Invalid operator!\nThe 4 valid operators are: [ /, *, + and - ]");
		}
		
		// Close input stream
		input.close();
	}

}
