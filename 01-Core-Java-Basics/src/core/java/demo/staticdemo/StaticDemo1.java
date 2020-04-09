package core.java.demo.staticdemo;

public class StaticDemo1 {
	static {
		System.out.println("Inside the static block 3");
	}
	public static void main(String[] args) {
		System.out.println("Inside the main");
	}
	//1. Static block executes before main method 
	static {
		System.out.println("Inside the static block 1");
	}
	//2. Static block executes sequentially
	static {
		System.out.println("Inside the static block 2");
	}
}
