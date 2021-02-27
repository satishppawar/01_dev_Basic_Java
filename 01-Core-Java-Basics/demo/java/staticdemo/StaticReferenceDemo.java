package demo.java.staticdemo;

public class StaticReferenceDemo {

	static StaticReferenceDemo demo = new StaticReferenceDemo();

	public static void main(String[] args) {
		StaticReferenceDemo.demo.greet();

	}
	public void greet() {
		System.out.println("#####StaticReferenceDemo####");
	}
}
