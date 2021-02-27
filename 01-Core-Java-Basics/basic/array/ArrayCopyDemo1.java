package basic.array;

//Example :- copy the data from one array to another array

/*
 * =============================================================================
 * int[] java.util.Arrays.copyOfRange(int[] original, int from, int to)
 * =============================================================================
 * Parameters:
 * 
 * original the array from which a range is to be copied from the
 * 
 * initial index of the range to be copied, inclusive to the final index of the
 * 
 * range to be copied, exclusive. (This index may lie outside the array.)
 * 
 * =============================================================================
 * 
 */

public class ArrayCopyDemo1 {

	public static void main(String[] args) {
		int[] copyfrom = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int[] newarray = java.util.Arrays.copyOfRange(copyfrom, 1, 4);
		for (int aa : newarray) {
			System.out.println(aa);// 20 30 40
		}
	}
}
