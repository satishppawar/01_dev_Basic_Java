package demo.java.basic.string;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "ABCDEFG";

		System.out.println("String lenght is :" + str.length());

		// returns string from startIndex to endIndex
		System.out.println("Substring is :" + str.substring(2));

		// returns string from startIndex to endIndex-1
		System.out.println("Substring is :" + str.substring(1, 3));

		System.out.println("===========================================================================");
		System.out.println("Demo of string.equals vs ==");
		System.out.println("===========================================================================");
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

		System.out.println("==========================================================================");
		System.out.println("Demo of first index and last index");
		System.out.println("==========================================================================");
		String demoStr = "Hello! Welcome to the Java class. Hope you enjoy this class!! ";

		System.out.println("First indexof 'class' in demoStr: \n" + demoStr + " is " + demoStr.indexOf("class"));
		System.out.println("Last indexof 'class' in demoStr: \n" + demoStr + " is " + demoStr.lastIndexOf("class"));
	}
	
}