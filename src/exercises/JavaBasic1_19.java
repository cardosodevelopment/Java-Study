package exercises;

import java.util.Scanner;

public class JavaBasic1_19 {
	public static void main(String[] args) {
		
		// Write a Java program to convert an integer number to a binary number.
		
		int decimal;
		int i;
		//int newDecimal = 0;
		int binary = 0;
		int[] binaryRegister = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a decimal number: ");
		decimal = input.nextInt();
		input.close();
		
		/*for (i = 0; decimal >= 1; ++i) {
			if (decimal != 0) {
				binaryRegister[i] = decimal & 1;
				newDecimal = decimal >> 1;
			}
			decimal = newDecimal;
		}*/
		
		for (i = 0; i < 8; i++) {
			int bit;
			bit = (decimal >> i) & 1;
			binaryRegister[i] = bit;
		}
		
		while (i >= 0) {
			binary = binary * 10 + binaryRegister[i--];
		}
		
		System.out.println("The converted number is: " + binary);
	}
}
