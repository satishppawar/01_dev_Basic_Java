package demo.java.array;

import java.util.Scanner;

//Example :-febonacci series
public class ArrayUtilDemo4 {

	public static void main(String[] args) {
		System.out.println("enter start series of febonacci");
		int x = new Scanner(System.in).nextInt();
		int[] feb = new int[x];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < x; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		// print the data
		for (int feb1 : feb) {
			System.out.print(" " + feb1);
		}
	}
}
