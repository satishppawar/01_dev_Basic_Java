package core.java.demo.staticdemo;

public class StaticMethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Executing the main method");
		method1();
	}

	static void method1() {
		System.out.println("Executing the static method1");
	}

	static {
		System.out.println("Executing the static block");
		method1();
	}
}
