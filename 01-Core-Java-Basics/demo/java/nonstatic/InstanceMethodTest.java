package demo.java.nonstatic;

public class InstanceMethodTest {
	// instance variable
	int instanceVar = 10;

	// Static var or class variables
	static String staticVar = "Welcome";

	/*
	 * Instance methods can access instance variables and instance methods directly.
	 * 
	 * Instance methods can access class variables and class methods directly.
	 */
	public void instanceMethod1() {
		System.out.println("instanceMethod1 is called.");
		System.out.println("instanceVar : " + instanceVar);
		instanceMethod2();

		System.out.println("staticVar : " + staticVar);
		staticMethod();
	}

	public void instanceMethod2() {
		System.out.println("instanceMethod2 is called.");
	}

	public static void staticMethod() {
		System.out.println("staticMethod is called.");
	}

}
