package core.java.demo.nonstatic;

public class ThisKeywordDemo {
	int age;

	public ThisKeywordDemo() {
		// this points to object reference
		System.out.println(this);
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}
}
