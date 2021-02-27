package basic.array;

import java.util.Scanner;

public class ArrayDemo2DynamicInput {

	private static Scanner s;

	public static void main(String[] args) {
		{
			int[] a = new int[5];
			s = new Scanner(System.in);
			System.out.printf("enter %d values \n", a.length);
			for (int i = 0; i < a.length; i++) {
				System.out.printf("enter value for %d index ", i);
				System.out.println();
				a[i] = s.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				System.out.printf("Value at index %d is %d", i, a[i]);
				System.out.println();
			}
		}

	}
}
