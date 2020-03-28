package core.java.demo.nonstatic;

//Non static block executes every time  an object is created before constructor
//Static block executes only once when the class is loaded
public class StaticVsNonStaticDemo {

	public StaticVsNonStaticDemo() {
		System.out.println("Inside constructor");
	}

	{
		System.out.println("Inside the non static block");
	}

	// Static block executes only once when the class is loaded
	static {
		System.out.println("Inside the  static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		// Non static block executes every time an object is created before constructor
		// execution
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
		new StaticVsNonStaticDemo();
	}
}
