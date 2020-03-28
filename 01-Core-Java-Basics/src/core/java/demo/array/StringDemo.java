package core.java.demo.array;

public class StringDemo {

	// Static member
	static String str = "Mahesh";

	String str1 = new String("Satish");
	char[] chArray = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
	String greetings = new String(chArray);

	public static void main(String[] args) {
		System.out.println(str);
		StringDemo stringDemo = new StringDemo();
		System.out.println(stringDemo.greetings);
		System.out.println(stringDemo.str1);
	}
}
