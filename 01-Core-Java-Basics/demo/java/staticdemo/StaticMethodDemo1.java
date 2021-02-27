package demo.java.staticdemo;

public class StaticMethodDemo1 {
	static int age;

	public static void main(String[] args) {
		System.out.println("Executing the main method");
		method1();
	}

	static void method1() {
		System.out.println("Executing the static method");
		System.out.println("Age is::" + age);

		StaticMethodDemo1 demo1 = new StaticMethodDemo1();
		demo1.greet();
		// greet(); Can not be access directly
	}

	static void staticMethod1() {
		System.out.println("Executing StaticMethodDemo1 class :: staticMethod1() :: method");
	}

	public void greet() {
		staticMethod1(); // static method within same class
		System.out.println("Executing StaticMethodDemo1 class :: greet() :: method");
	}
}

class Test {
	public void test() {
		System.out.println("Executing Test class method");
		StaticMethodDemo1.method1(); // static method in another class
	}
}
