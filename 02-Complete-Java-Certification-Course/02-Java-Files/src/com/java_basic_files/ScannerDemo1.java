package com.java_basic_files;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the some text");
		String enteredText = input.nextLine();
		System.out.println("enteredText is \n" + enteredText);
	}
}
