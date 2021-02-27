package demo.basic.util;

public class SrtringDemo {
	static int count = 0;

	public static void main(String[] args) {
		String message = "Hello";
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i + 1));
		}

		if (count < 3) {
			count++;
			main(null);
		} else {
			return;
		}
		System.out.println("Hello world");
		String s = "nifty";
		if (s.getClass().getSimpleName() == "String") {
			System.out.println("It is a string");
		} else if ("string " instanceof String) {
			System.out.println("It is a instanceof string");
		}
		System.out.println("END" + s.getClass().getSimpleName());

	}
}
