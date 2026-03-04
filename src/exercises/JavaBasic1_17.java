package exercises;

import java.util.Scanner;

public class JavaBasic1_17 {
	public static void main(String[] args) {
		
		// Write a Java program to add two binary numbers:
		
		// Declare variables to store two binary numbers, and index, and a remainder
		long binary1, binary2;
		int i = 0, remainder = 0;
		int countIteration = 0;
		
		// Create an array to store the sum of binary digits
		int[] sum = new int[20];
		
		// Create a Scanner object to read input from the user
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to input the first binary number
		System.out.println("Input first binary number: ");
		binary1 = in.nextLong();
		
		// Prompt the user to input the second binary number
		System.out.println("Input second binary number: ");
		binary2 = in.nextLong();
		
		// Perform binary addition while there are digits in the binary numbers
		while (binary1 != 0 || binary2 != 0) {
			// Calculate the sum of binary digits and update the remainder
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
			// Just for counting the times that while loops
			countIteration++;
		}
		
		// If there is a remaining carry, add it to the sum
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		
		// Decrement the index to prepare for printing
		--i;
		
		// Display the sum of the two binary numbers
		System.out.println("Sum of two binary numbers: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		
		System.out.println("\n");
		System.out.println("Iterations = " + countIteration);
		
		in.close();
		
		/* Explanation:

		In the exercise above -

		Initialize variables to store the two binary numbers ('binary1' and 'binary2'), an array 'sum' to store the sum, and other necessary variables.
		Takes two binary numbers from the user using the "Scanner" class.
		Next it enters a loop to perform binary addition from the least significant digit (rightmost) to the most significant digit (leftmost).
			Calculate the sum of the corresponding digits from both binary numbers and any remainder from the previous addition.
			Store the least significant digit of the sum in the 'sum' array.
			Update the remainder and divide both input binary numbers by 10 to move to the next digit.
		After the loop, if there's still a remainder left, it adds it to the 'sum' array.
		Prints the sum of the two binary numbers by iterating through the 'sum' array from the most significant digit to the least significant digit.
		The result is displayed as a binary number. */

	}
}
