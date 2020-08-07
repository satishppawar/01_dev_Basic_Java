package demo.java.staticdemo;

public class StaticDemo2 {
	public static void main(String[] args) {
		System.out.println("Inside the main");
	}

	// Multiple Static block executes one after sequentially
	static {
		System.out.println("Inside the static block 2");
	}

	static {
		System.out.println("Inside the static block 1");
	}

}
