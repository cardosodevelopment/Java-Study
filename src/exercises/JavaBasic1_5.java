package exercises;

import java.util.Scanner;

public class JavaBasic1_5 {
	public static void main(String[] args) {
		
		// Write a Java program that takes two numbers as input and displays the product
		// of them.
		System.out.println("This program return the product of two integers.\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the first number: ");
		int a = input.nextInt();
		
		System.out.println("Input the second number: ");
		int b = input.nextInt();
		
		System.out.println("The product of " + a + " and " + b + " is = " + (a * b));
		
		input.close();
	}
}
