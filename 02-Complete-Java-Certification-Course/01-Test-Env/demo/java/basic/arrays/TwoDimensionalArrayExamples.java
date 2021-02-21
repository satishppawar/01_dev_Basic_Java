package demo.java.basic.arrays;

import java.util.Arrays;

public class TwoDimensionalArrayExamples {
	public static void main(String[] args) {
		int[][] cordinates = { { 1, 2 }, { 2, 4 }, { 3, 6, 9 } };

		System.out.println(print2DArray(cordinates));
	}

	public static String print2DArray(int arr[][]) {
		StringBuilder builder = new StringBuilder();
		// Open bracket
		builder.append("[");

		// Loop through all rows and print
		for (int i = 0; i < arr.length; i++) {
			builder.append(Arrays.toString(arr[i]) + ", ");
		}

		// Delete last two characters
		builder.deleteCharAt(builder.length() - 1);
		builder.deleteCharAt(builder.length() - 1);

		// Close bracket
		builder.append("]");

		return builder.toString();
	}
}
