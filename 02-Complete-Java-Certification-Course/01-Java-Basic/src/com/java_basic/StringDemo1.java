package com.java_basic;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "ABCDEFG";
		// returns string from startIndex to endIndex-1
		System.out.println("Substring is :" + str.substring(0, 2));

		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");

		// == checks does the reference comparison as String is class
		if (str1 == str2) {
			System.out.println("Two strings str1 and str2 have same reference");
		}

		if (str1 == str3) {
			System.out.println("Two strings str1 and str3 have same reference");
		}

		// Use equals()
		if (str1.equals(str3)) {
			System.out.println("Two strings str1 and str3 have same content");
		}
	}
}
