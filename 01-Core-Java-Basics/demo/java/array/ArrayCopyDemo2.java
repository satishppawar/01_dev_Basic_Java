package demo.java.array;

//Example :- copy the data from one array to another array
public class ArrayCopyDemo2 {
	public static void main(String[] args) {
		int[] copyfrom = { 10, 20, 30, 40, 50, 60, 70, 80 };

		// int[] java.util.Arrays.copyOfRange(int[] original, int from, int to)
		int[] newarray = java.util.Arrays.copyOfRange(copyfrom, 1, 4);
		for (int aa : newarray) {
			System.out.println(aa);// 20 30 40s
		}
	}
}
