package core.java.demo.staticdemo;

public class StaticDemo1 {
	public static void main(String[] args) {
		System.out.println("Inside the main");
	}
	//Static block executes before main method 
	static {
		System.out.println("Inside the static block 1");
	}
	//execute before main
	static {
		System.out.println("Inside the static block 2");
	}
}
