package demo.java.array;

import java.util.Scanner;

//Example :- taking array elements from dynamic input by using scanner class.

public class ArrayDemo2 {
	public static void main(String[] args) {
		int demoArray[] = new int[5];
		try {
			Scanner input = new Scanner(System.in);
			int len = demoArray.length;
			System.out.printf("enter %d values", len);
			System.out.println();
			for (int i = 0; i < demoArray.length; i++) {
				System.out.println("Please enter array " + i + " value");
				demoArray[i] = input.nextInt();
			}
			for (int a1 : demoArray) {
				System.out.println(a1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
