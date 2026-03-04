package exercises;

import java.util.Scanner;

public class JavaBasic1_12 {
	public static void main(String[] args) {
		
		// Write a Java program that takes three numbers as input to calculate 
		// and print the average of the numbers:
		
		System.out.println("=== This program prints the average of three numbers ===");
		
		Scanner input = new Scanner(System.in);
		int result;
		
		System.out.println("Input the first number: ");
		int inputNumber = input.nextInt();
		
		System.out.println("Input the second number: ");
		int inputNumber2 = input.nextInt();
		
		System.out.println("Input the third number: ");
		int inputNumber3 = input.nextInt();
		
		result = (inputNumber + inputNumber2 + inputNumber3) / 3;
		
		System.out.println("The average is = " + result);
		
		input.close();
	}
}
