package core.java.demo.nonstatic;

public class NonStaticMemberDemo {
	int num;

	// 1. Constructor
	public NonStaticMemberDemo() {
		System.out.println("Inside Constructor");
	}	

	// 2. non-static block executes before constructor
	{
		System.out.println("Inside non-static block ");
	}

	static {
		System.out.println("Inside static block ");
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		new NonStaticMemberDemo();
		// 3. Non static method Call
		NonStaticMemberDemo demo = new NonStaticMemberDemo();
		demo.dosomething();
	}

	// 3. Non static method
	private void dosomething() {
		System.out.println("Inside the dosomething");
	}
}
