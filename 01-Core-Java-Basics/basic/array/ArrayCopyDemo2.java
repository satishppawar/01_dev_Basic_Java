package basic.array;

//Example :- copy the data from one array to another arrayExample :- copy the data from one array to another array

/*
 * =============================================================================
 * void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * =============================================================================
 * 
 * Parameters:
 * 
 * src the source array.
 * 
 * srcPos starting position in the source array.
 * 
 * dest the destination array. destPos starting position in the destination
 * data.
 * 
 * length the number of array elements to be copied.
 * 
 * =============================================================================
 * 
 */

public class ArrayCopyDemo2 {

	public static void main(String[] args) {
		int[] copyfrom = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] copyto = new int[7];

		System.arraycopy(copyfrom, 1, copyto, 0, 7);
		for (int cc : copyto) {
			System.out.println(cc);
		}
	}

}
