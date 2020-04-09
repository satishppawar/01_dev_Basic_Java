package core.java.demo.staticdemo;

public class StaticMethodDemo1 {
	static int age;
	public static void main(String[] args) {
		System.out.println("Executing the main method");
		method1();
	}

	static void method1() {
		System.out.println("Executing the static method");
		System.out.println("Age is"+age);
	}
}
