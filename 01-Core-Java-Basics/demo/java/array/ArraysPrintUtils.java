package demo.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPrintUtils {
	public static void main(String[] args) {
		// 1. Arrays.toString() to print simple arrays
		// An array of String objects
		String[] array = new String[] { "First", "Second", "Third", "Fourth" };

		System.out.println("1D array is:- " + array);// Wrong way
		// Print the array using default toString method - Do not Use it
		System.out.println("1D array using toString() is:- " + array.toString());

		// Print the array using Arrays.toString() - "RECOMMENDED for simple arrays"
		System.out.println("1D array is:- " + Arrays.toString(array));

		System.out.println("----------------------------------------");

		// 2. Arrays.deepToString() to print multi-dimensional array
		/*
		 * What will happen if somewhere in hierarchy another array is stored, like in
		 * case of array of arrays. Use Arrays.deepToString() to print array which
		 * contain other arrays i.e print 2D arrays.
		 */
		String[] arr1 = new String[] { "Fifth", "Sixth" };
		String[] arr2 = new String[] { "Seventh", "Eight" };

		// An array of array containing String objects
		String[][] arrayOfArray = new String[][] { arr1, arr2 };

		// Compare the different outputs

		// Print the array using default toString method
		System.out.println("2D array is:- " + arrayOfArray);// Wrong way

		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(arrayOfArray));

		// Print the array using Arrays.deepToString() - "RECOMMENDED for
		// multi-dimensional array"
		System.out.println(Arrays.deepToString(arrayOfArray));

		System.out.println("----------------------------------------");

		// A normal java list having four String objects
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");

		// Print the list in console
		System.out.println(list);

	}
}
