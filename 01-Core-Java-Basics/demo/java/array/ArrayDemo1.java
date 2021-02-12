package demo.java.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		/**
		 * Different ways to declare a Array:- int[] values; int []values; int values[];
		 */

		// declaration& instantiation & initialization :-
		System.out.println("declaration& instantiation & initialization :-");
		// Approach 1:-
		System.out.println("=========Approach 1:-=================");

		int array1[] = { 10, 20, 30, 40 }; // declaring, instantiation, intialization

		System.out.println("array1 is");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Element: " + (i + 1) + " is " + array1[i]);
			System.out.println();
		}

		System.out.println("=========Approach 2:-=================");

		int[] anArray = new int[10]; // declaring, instantiation

		anArray[0] = 10; // initialize first element

		// initialize second element
		anArray[1] = 20;
		// and so forth
		anArray[2] = 30;
		anArray[3] = 40;
		anArray[4] = 50;
		anArray[5] = 60;
		anArray[6] = 70;
		anArray[7] = 80;
		anArray[8] = 90;
		anArray[9] = 100;

		System.out.println("array2 is");
		for (int i = 0; i < anArray.length; i++) {
			// if no value is assigned Java sets the default values
			System.out.print("Element: " + (i + 1) + " is " + anArray[i]);
			System.out.println();
		}

	}
}
