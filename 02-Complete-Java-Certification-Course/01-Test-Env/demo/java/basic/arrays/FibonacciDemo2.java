package demo.java.basic.arrays;

import java.util.Scanner;

public class FibonacciDemo2 {
	public static void main(String[] args) {
		System.out.println("enter the no required for febonacci");
		int a = new Scanner(System.in).nextInt();
		System.out.println("enter first no of febonacci");
		int x = new Scanner(System.in).nextInt();
		System.out.println("enter second no of febonacci");
		int y = new Scanner(System.in).nextInt();
		int[] feb = new int[a];
		feb[0] = x;
		feb[1] = y;
		for (int i = 2; i < a; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		// print the data
		for (int feb1 : feb) {
			System.out.print(" " + feb1);
		}
	}
}
