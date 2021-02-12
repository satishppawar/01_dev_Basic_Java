package intw.java.demo;

//Write a method to check if input String is Palindrome?
//https://www.journaldev.com/1321/java-string-interview-questions-and-answers#java-string
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "aba";
		System.out.println("isPalindrome string " + str + ":" + isPalindrome(str));
		System.out.println("isPalindromeString string " + str + ":" + isPalindromeString(str));

		String newStr = "madam";
		System.out.println("isPalindromeString string " + newStr + ":" + isPalindromeString(newStr));

		String demoStr = "New String";
		System.out.println("isPalindrome string " + demoStr + ":" + isPalindrome(demoStr));
	}

	private static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		// System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

}
