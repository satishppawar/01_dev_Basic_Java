package demo.java.nonstatic;

//1. Non static block executes every time  an object is created before constructor
//2. Static block executes only once when the class is loaded
public class StaticVsNonStaticDemo {

	public StaticVsNonStaticDemo() {
		System.out.println("Inside constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	// 2. Static block executes only once when the class is loaded
	static {
		System.out.println("Inside the  static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		// 1. Non static block executes every time an object is created before constructor
		// execution
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
	}
}
