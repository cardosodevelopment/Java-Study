package exercises;

import java.util.Scanner;

public class JavaBasic1_1 {
	public static void main(String[] args) {
		
		// Write a Java program to print 'Hello' on screen and
		// your name on a separate line:
		
		System.out.println("Hello\nVinicius Cardoso!");
		
		// Sample solution using input from the user:
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your first name: ");
		String firstName = input.next();
		
		System.out.println("Input your last name: ");
		String lastName = input.next();
		
		System.out.println();
		System.out.println("Hello " + firstName + " " + lastName);
		
		input.close();
	}
}
