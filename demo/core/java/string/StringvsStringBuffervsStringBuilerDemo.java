package demo.core.java.string;

/**
 * 
 * @author spawar
 * @category String vs StringBuffer vs StringBuilder.
 * 
 * 	1.	String class represents character strings, we can instantiate String by two ways.
 * 	  	
 * 			String str = "abc"; or String str = new String ("abc");
 * 
 *	 2. String is immutable in Java, so it’s easy to share it across different threads or functions.
 * 
 * 	3. 	When we create a String using double quotes, { e.g String str = "abc"; } it first looks for the String with the same value 
 * 	  	in the JVM string pool, if found it returns the reference else it creates the String object and then places it in the String pool. 
 * 	  
 * 		This way JVM saves a lot of space by using the same String in different threads. 
 * 	  	But if a new operator is used, it explicitly creates a new String in the heap memory.
 * 
 * 
 */

public class StringvsStringBuffervsStringBuilerDemo {

	public static void main(String[] args) {

		
		String literalString = "abc"; 
		String literalString2 = "abc"; 
		//String newString = new String ("abc");
		
		
		//System.out.println("literalString==newString ? "+literalString==newString);
		System.out.println("literalString2==literalString ? "+literalString2==literalString);
		
		
	}

}
