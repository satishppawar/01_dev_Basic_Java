package demo.java.nonstatic;

//Demo to create a object inside the static method
public class DemoReference {

	static DemoReference obj = new DemoReference();
	static {
		System.out.println("Inside static block");
		System.out.println(DemoReference.obj);
		// Creates a new reference
		DemoReference.init();
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		System.out.println(DemoReference.obj);
	}

	static void init() {
		System.out.println("Inside  init()");
		DemoReference.obj = new DemoReference();
	}
}
