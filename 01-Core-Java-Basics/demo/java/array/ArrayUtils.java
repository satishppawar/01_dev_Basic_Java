package demo.java.array;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayUtils {
	public static void main(String[] args) {

		// 1. String to String[]
//Example 1
		String blogName = "how to do in java";
		String[] words = null;

		// Method 1 :: using String.split() method
		words = blogName.split(" "); // [how, to, do, in, java]

		// Method 2 :: using Pattern.split() method
		Pattern pattern = Pattern.compile(" ");
		words = pattern.split(blogName); // [how, to, do, in, java]

		
		String newName = String.join(" ", words); // "how to do in java"
		System.out.println(newName);
		
		// Example 2
		String names = "alex,brian,charles,david";
		String[] namesArray = null;

		// Split string with comma
		Pattern pattern1 = Pattern.compile(",");
		namesArray = pattern1.split(names);

		// Verify array content
		System.out.println(Arrays.toString(namesArray));
	}
}
