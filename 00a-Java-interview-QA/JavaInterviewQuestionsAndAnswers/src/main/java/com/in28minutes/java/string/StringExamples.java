package com.in28minutes.java.string;

/**
 * 
 * - 16 . Are all String’s immutable?
	- 17 . Where are String values stored in memory?
	- 18 . Why should you be careful about String concatenation(+) operator in loops?
	- 19 . How do you solve above problem?
	- 20 . What are differences between String and StringBuffer?
	- 21 . What are differences between StringBuilder and StringBuffer?
	- 22 . Can you give examples of different utility methods in String class?

 *
 */

public class StringExamples {
	public static void main(String[] args) {

		/*
		 * //########################################################################
		 * 16 . Are all String’s immutable?
		 * //########################################################################
		 * Value of a String Object once created cannot be modified. Any modification on
		 * a String object creates a new String object
		 */// ########################################################################

		// Strings are immutable
		System.out.println(
				"Strings are immutable.Value of a String Object once created cannot be modified. Any modification on a String object creates a\n"
						+ "new String object.");
		String str3 = "value1";
		str3.concat("value2");
		/*
		 * Note that the value of str3 is not modified in the above example. The result
		 * should be assigned to a new reference variable (or same variable can be
		 * reused). All wrapper class instances are immutable too!
		 */

		System.out.println("str3 is " + str3); // output value1

		// The result should be assigned to a new reference variable (or same
		// variable) can be reused.
		String concat = str3.concat("value2");
		System.out.println(concat); // value1value2
		System.out.println("########################################################################");

		// ########################################################################
		// 17 . Where are String values stored in memory?
		// ########################################################################
		// The location where the string values are stored in memory depends on how we create them.
		// String on Heap.xls
		// A String value once created, cannot be changed.
		// If a method is invoked on string object, it returns a new object and
		// will not modify the original object.

		// All strings literals are stored in "String constant pool".
		// If compiler finds a String literal,it checks if it exists in the
		// pool.
		// If it exists, it is reused.
		// ########################################################################

		// 1 string object (created on the pool) and 1 reference variable
		System.out.println("All strings literals are stored in \"String constant pool\".");
		// However, if new operator is used to create string object,
		// the new object is created on the heap
		// ########################################################################
		// READ MORE -> https://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html#axzz6oyqRkx5r
		// ########################################################################
		// Following piece of code create 2 objects
		// 1. String Literal "value" - created in the "String constant pool"
		// 2. String Object - created on the heap
		// String was made final so that no one can compromise invariant of String class
		// like Immutability, Caching, hashcode calculation, etc by extending and
		// overriding behaviors. Another reason why String class is immutable could die
		// due to HashMap.
		
		String str1 = "value";
		String str2 = new String("value");
		String emptyString="";
		System.out.println("Hashcode of str1 is ::"+str1.hashCode());
		System.out.println("Hashcode of str2 is ::"+str2.hashCode());
		System.out.println("Hashcode of emptyString ::"+emptyString+"is ::"+emptyString.hashCode());
		System.out.println("str1==str2"+str1==str2);
		

		// String methods
		String str = "abcdefghijk";
		// 01234567890

		// char charAt(int paramInt)
		System.out.println(str.charAt(2)); // prints a char - c
		System.out.println("########################################################################");
		System.out.println("Why should you be careful about String concatenation(+) operator in loops?");
		// ########################################################################
		//- 18 . Why should you be careful about String concatenation(+) operator in loops?
		// String concat(String paramString)
		// ########################################################################
		System.out.println(str.concat("lmn"));// abcdefghijklmn
		
		// REFER EXAMPLE --> /JavaInterviewQuestionsAndAnswers/src/test/java/StringVsStringBuffer.java
		String s3 = "Value1";
		String s2 = "Value2";
		for (int i = 0; i < 100; ++i) {
			s3 = s3 + s2;// How many objects are created in memory? More than 100 Strings are created.
							// This will have a huge performance impact.
		}

		System.out.println("ABC".equalsIgnoreCase("abc"));// true
		System.out.println("ABCDEFGH".length());// 8

		// String replace(char paramChar1, char paramChar2)
		System.out.println("012301230123".replace('0', '4'));// 412341234123

		// String replace(CharSequence paramCharSequence1, CharSequence
		// paramCharSequence2)
		System.out.println("012301230123".replace("01", "45"));// 452345234523

		// All characters from index paramInt
		// String substring(int paramInt)
		System.out.println("abcdefghij".substring(3)); // defghij
		// 0123456789

		// All characters from index 3 to 6
		System.out.println("abcdefghij".substring(3, 7)); // defg
		// 0123456789

		System.out.println("ABCDEFGHIJ".toLowerCase()); // abcdefghij

		System.out.println("abcdefghij".toUpperCase()); // ABCDEFGHIJ

		System.out.println("abcdefghij".toString()); // abcdefghij

		// trim removes leading and trailings spaces
		System.out.println(" abcd  ".trim()); // abcd
	}
}
