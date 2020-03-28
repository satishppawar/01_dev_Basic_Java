package core.java.demo.nonstatic;

public class DefaultConstructorDemo {
	public static void main(String[] args) {
		System.out.println("Inside the main");
		// JVM adds default constructor if it is not present
		new DefaultConstructorDemo();

	}
}
