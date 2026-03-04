package main;

public class ArrayCopyOfDemo {
	public static void main(String[] args) {
		
		String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
							"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
							"Marocchino", "Ristretto"};
		
		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		
		/*for (String coffee : copyTo) {
			System.out.println(coffee + ' ');
		}*/
		
		/* Creating a stream that uses an array as its source (the stream method).
		 * For example, the following statement prints the contents of the copyTo
		 * array in the same way as in the previous example. */
		java.util.Arrays.stream(copyTo).map(coffee -> coffee + ' ').forEach(System.out::print);
		
		/* Converting an array to a stream. The toString method converts each
		 * element of the array to a string, separates them with commas, then
		 * surrounds them with brackets. */
		System.out.println(java.util.Arrays.toString(copyTo));
	}
}
