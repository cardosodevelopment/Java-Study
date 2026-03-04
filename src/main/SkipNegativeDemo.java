package main;

public class SkipNegativeDemo {
	public static void main(String[] args) {
		
		int[] numbers = {3, -1, -6, -7, 5, 9, 0, 10};
		
		for (int n : numbers) {
			if (n < 0) {
				continue;
			}
			System.out.println(n);
		}
	}
}
