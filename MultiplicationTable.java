/*
 * Program: Multiplication Table (1-10)
 * Author: adizcode a.k.a Advitiay Anand
 */

public class MultiplicationTable {
	
	// The main method
	public static void main(String[] args) {
		
		// Outer loop: Iterates from i = 1 to i = 10
		for (int i = 1; i < 11; i++) {
			
			// Inner loop: Iterates from j = 1 to j = 10 for every iteration of outer loop
			for (int j = 1; j < 11; j++) {
				
				// Print multiple of i and j
				System.out.print(i * j + " ");
			}
			
			// Add newline
			System.out.println();
		}
	}

}
