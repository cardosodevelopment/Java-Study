package exercises;

public class JavaBasic1_15 {
	public static void main(String[] args) {
		
		// Write a Java program to swap two variables.
		
		int a = 1;
		int b = 2;
		int temp;
		
		System.out.println("The value of a is = " + a);
		System.out.println("The value of b is = " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("The new value of a is = " + a);
		System.out.println("The new value of b is = " + b);
	}
}
