package intw.java.demo;

/**
 * <a href>Java String Interview Question</a>
 * 
 * 
 * 
 * https://www.journaldev.com/1321/java-string-interview-questions-and-answers#java-string
 * 
 */
public class StringDemo1 {

	public static void main(String[] args) {
		// Que1 : What are different ways to create String Object?

		// When we create a String using double quotes, JVM looks in the String pool to
		// find if any other String is stored with the same value. If found, it just
		// returns the reference to that String object else it creates a new String
		// object with given value and stores it in the String pool.

		String str = new String("abc");

		// When we use the new operator, JVM creates the String object but don’t store
		// it into the String Pool. We can use intern() method to store the String
		// object into String pool or return the reference if there is already a String
		// with equal value present in the pool.
		String str1 = "abc";

		System.out.println("String str = " + str);
		System.out.println("String str1 = " + str1);
	}
}
