package demo.basic.util;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://beginnersbook.com/2014/01/java-program-to-check-palindrome-string/
 * 
 *
 */
public class PalindromeString {

	// Program 2: Palindrome check Using Queue

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	// Program 3: Using for loop/While loop and String function charAt
	public static void isPalindrome3(String str) {

		String reverseString = "";

		System.out.println("Enter a string to check if it is a palindrome:");
		String inputString = str;

		int length = inputString.length();

		for (int i = length - 1; i >= 0; i--)
			reverseString = reverseString + inputString.charAt(i);

		if (inputString.equals(reverseString))
			System.out.println("Input string is a palindrome.");
		else
			System.out.println("Input string is not a palindrome.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		System.out.println("Eneter string to check PalindromeString");
		Stack stack = new Stack();

		for (int i = 0; i < inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}

		String reverseString = "";

		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}

		if (inputString.equals(reverseString))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
