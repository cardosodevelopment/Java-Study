package exercises;

import java.util.Scanner;

public class JavaBasic1_11 {
	public static void main(String[] args) {
		
		// Write a Java program to print the area and perimeter of a circle:
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== This program calculate the area and perimeter of a circle ===\n");
		
		System.out.print("Input the radius of a circle: ");
		float inputNumber = input.nextFloat();
		
		System.out.println("The parameter of the circle is = " + (2 * Math.PI * inputNumber));
		System.out.println("The area of the circle is = " + (Math.PI * (inputNumber * inputNumber)));
		
		input.close();
	}
}
