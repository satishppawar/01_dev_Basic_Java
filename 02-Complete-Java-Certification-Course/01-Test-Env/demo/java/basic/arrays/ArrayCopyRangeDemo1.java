package demo.java.basic.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * <code>
                public static <T> T[] copyOfRange(T[] original, int from, int to) {
              	return copyOfRange(original, from, to, (Class<? extends T[]>) original.getClass());
                 }
                </code>
 * 
 * @param          <T> the class of the objects in the array
 * @param original the array from which a range is to be copied
 * @param from     the initial index of the range to be copied, inclusive
 * @param to       the final index of the range to be copied, exclusive.
 *                 <strong>'to' index parameter can be greater than index
 *                 length. No ArrayIndexOutOfBoundsException will be raised in
 *                 this case. </strong>
 *
 *
 */

public class ArrayCopyRangeDemo1 {

	public static void main(String[] args) {
		// Example 1
		/**
		 * Java example to create subarray from array i.e. creating array slice. Java 8
		 * Arrays.copyOfRange() method along with converting the subarray to list
		 * object.
		 */
		System.out.println("##### Demo of copyOfRange ########");
		String[] names = { "Alex", "Brian", "Charles", "David" };

		System.out.println("Original names are :-" + Arrays.toString(names));

		// Subarray from index '0' (inclusive) to index '2' (exclusive)
		// Copy till second name from with index '0'
		String[] partialNames = Arrays.copyOfRange(names, 0, 2);
		System.out.println("partialNames are :- " + Arrays.toString(partialNames));

		// Copy all names from with index '2'
		String[] endNames = Arrays.copyOfRange(names, 2, names.length); // [Charles, David, null, null, null, null,
																		// null, null]
		System.out.println("endNames are :- " + Arrays.toString(endNames));

		// Copy last 8 names start with index '2'
		// No ArrayIndexOutOfBoundsException error
		String[] moreNames = Arrays.copyOfRange(names, 2, 10);
		System.out.println("moreNames are :- " + Arrays.toString(moreNames));

		System.out.println("------------------------------------");

		// Subarray to list
		System.out.println("##### Subarray to list ########");

		List<String> namesList = Arrays.asList(Arrays.copyOfRange(names, 2, names.length));
		System.out.println("Subarray to list :-" + namesList);

	}

}
