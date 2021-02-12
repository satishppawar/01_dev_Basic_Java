package demo.java.nonstatic;

public class Demo {

	static Demo demoStatic;
	// 1. Local reference inside static block
	static {
		Demo demo = new Demo();
		System.out.println(demo);
	}

	// 2. Global reference inside static block
	static {
		System.out.println("1. Demo.demoStatic is :" + Demo.demoStatic);
		Demo.demoStatic = new Demo();
		System.out.println("2. Demo.demoStatic is :" + demoStatic);
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		// Static reference would be same as line 16
		System.out.println(Demo.demoStatic);
	}
}
