package exercises;

import java.util.Scanner;

public class JavaBasic1_7 {
	public static void main(String[] args) {
		
		// Write a Java program that takes a number as input and print its
		// multiplication table up to 10:
		
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("This program prints in the screen the multiplication table of number that you input: ");
		
		System.out.println("Input the number: ");
		int number = inputNumber.nextInt();
			
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		
		inputNumber.close();
	}
}
