package demo.basic.java.reflection;

public class ReflectionDemo1 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("PLEASE PASS THE CLASS NAME..!");
		} else {
			try {
				Class c = Class.forName(args[0]);
				printSuperclass(c);
			} catch (ClassNotFoundException cnfe) {
				System.out.println(args[0] + " DOES NOT EXISTS...");
			}
		}
	}

	static void printSuperclass(Class c) {
		String s = c.getName();
		Class sc = c.getSuperclass();
		String sn = sc.getName();
		System.out.println(sn + " IS THE SUPER CLASS OF " + s);
	}
}
