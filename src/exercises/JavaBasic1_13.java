package exercises;

import java.util.Scanner;

public class JavaBasic1_13 {
	public static void main(String[] args) {
		
		// Write a Java program to print the area and perimeter of a rectangle:
		System.out.println("=== This program calculates the area and perimeter of a rectangle ===");
		
		Scanner input = new Scanner(System.in);
		float width;
		float height;
		
		System.out.println("Input the width: ");
		width = input.nextFloat();
		
		System.out.println("Input the height: ");
		height = input.nextFloat();
		
		input.close();	
		
		System.out.println("The area of the rectangle is = " + (width * height));
		System.out.println("The perimeter of the rectangle is = " + (2 * (width + height)));
						
	}
}
