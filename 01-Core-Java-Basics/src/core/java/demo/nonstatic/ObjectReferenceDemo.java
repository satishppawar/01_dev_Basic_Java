package core.java.demo.nonstatic;

public class ObjectReferenceDemo {

	int count;

	public ObjectReferenceDemo() {
	}

	public static void main(String[] args) {
		ObjectReferenceDemo demo = new ObjectReferenceDemo();
		System.out.println("Inside main method :" + demo.count);
	}
}
