package demo.basic.java.reflection;

public class First {
	public static void main(String[] args) {
		String s = new String("HELLO");
		printSuperclass(s);
	}

	static void printSuperclass(Object s) {
		Class c = s.getClass();
		Class sc = c.getSuperclass();
		System.out.println("NAME OF CURRENT CLASS : " + c.getName());
		System.out.println("NAME OF THE SUPER CLASS : " + sc.getName());
	}
}