package main;

public class MultiDimArrayDemo {
	public static void main(String[] args) {
		
		// Here is an example of a multidimensional array
		String[][] names = {
				{"Mr. ", "Mrs. ", "Ms. "},
				{"Smith", "Jones"}
		};
		
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);
	}
}
