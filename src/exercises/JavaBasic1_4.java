package exercises;

public class JavaBasic1_4 {
	public static void main(String[] args) {
		
		// Write a Java program to print the results of the following operations:
		// a. -5 + 8 * 6
		// b. (55 + 9) % 9
		// c. 20 + -3 * 5 / 8
		// d. 5 + 15 / 3 * 2 -8 % 3
		// Expected output: a = 43, b = 1, c = 19, and d = 13
		
		int a = -5 + 8 * 6;
		int b = (55 + 9) % 9;
		int c = 20 + -3 * 5 / 8;
		int d = 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println("The result of a is = " + a + "\n"
						 + "The result of b is = " + b + "\n"
						 + "The result of c is = " + c + "\n"
						 + "The result of d is = " + d + "\n");
	}
}
