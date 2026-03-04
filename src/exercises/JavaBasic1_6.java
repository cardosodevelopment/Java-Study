package exercises;

public class JavaBasic1_6 {
	public static void main(String[] args) {
		
		// Write a Java program to print the sum (addition), multiply, subtract, divide 
		// and remainder of two numbers.
		
		int a = 20;
		int b = 3;
		
		System.out.println("Below we have the arithmetic operations with given two numbers: ");
		System.out.println("Sum = " + (a + b) + '\n'
						 + "Multiply = " + (a * b) + '\n'
						 + "Divide = " + (a / b) + '\n'
						 + "Subtract = " + (a - b) + '\n'
						 + "Remainder = " + (a % b));
	}
}
