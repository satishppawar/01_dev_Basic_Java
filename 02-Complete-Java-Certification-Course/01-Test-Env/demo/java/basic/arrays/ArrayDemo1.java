package demo.java.basic.arrays;

import java.util.Scanner;

/**
 * Reference link -->
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * 
 * 
 * Example :- taking array elements from dynamic input by using scanner class.
 */

class ArrayDemo1 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter 5 values of integer type");
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter " + i + " value");
			a[i] = s.nextInt();
		}
		System.out.println("Array Element are: ");
		for (int a1 : a) {
			System.out.println(a1);
		}
	}
}
