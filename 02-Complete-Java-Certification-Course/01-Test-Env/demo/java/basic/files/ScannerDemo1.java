package demo.java.basic.files;

import java.util.Scanner;

public class ScannerDemo1 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Enter the some text");
		String enteredText = input.nextLine();
		System.out.println("enteredText is \n" + enteredText);
	}
}
