package core.java.demo.array;

import java.util.Arrays;

public class ArrayCopyDemo3 {
	public static void main(String[] args) {

		/**
		 * Java examples to copy an array to another array object using array clone,
		 * System.arrayCopy() and Arrays.copyOf() methods.
		 * 
		 * Note that all given below approaches create shallow copy of array.
		 */

		// 1) array.clone() ::- It is the most easy to use and recommended approach. It
		// create the clone of array in single statement.

		// all given below approaches create shallow copy of array.
		String[] names = { "Alex", "Brian", "Charles", "David" };

		// Use arr.clone() method - Recommended
		String[] cloneOfNames = names.clone();

		System.out.println("Original Array is:- " + names);
		System.out.println(Arrays.toString(names)); // [Alex, Brian, Charles, David]
		System.out.println("shallow copy of  Array is:- " + names);
		System.out.println(Arrays.toString(cloneOfNames)); // [Alex, Brian, Charles, David]

		System.out.println("--------------------------");
		// Use Arrays.copyOf() method - Most readable
		String[] copyOfNames = Arrays.copyOf(names, names.length);

		System.out.println(Arrays.toString(names)); // [Alex, Brian, Charles, David]
		System.out.println(Arrays.toString(copyOfNames)); // [Alex, Brian, Charles, David]

		System.out.println("--------------------------");
		/*
		 * 3) System.arraycopy() – Recommended Another useful method provided by JDK. It
		 * is native method and is also invoked within Arrays.copyOf() method,
		 * internally. But it makes code a little less readable due to multiple
		 * arguments used for invocation.
		 */
		/**
		 * @param src     the source array.
		 * @param srcPos  starting position in the source array.
		 * @param dest    the destination array.
		 * @param destPos starting position in the destination data.
		 * @param length  the number of array elements to be copied.
		 * 
		 *                public static native void arraycopy(Object src, int srcPos,
		 *                Object dest, int destPos, int length);
		 */
		// Using System.arraycopy() method - Equally efficient but less readable
		String[] copyOfNames2 = new String[names.length];
		System.arraycopy(names, 0, copyOfNames2, 0, copyOfNames2.length);

		System.out.println(Arrays.toString(names)); // [Alex, Brian, Charles, David]
		System.out.println(Arrays.toString(copyOfNames2)); // [Alex, Brian, Charles, David]

	}

}
