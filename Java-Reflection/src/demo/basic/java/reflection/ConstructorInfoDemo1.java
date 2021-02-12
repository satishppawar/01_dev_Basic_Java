package demo.basic.java.reflection;

public class ConstructorInfoDemo1 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("PLEASE PASS THE CLASS NAME..!");
		} else {
			try {
				Class c = Class.forName(args[0]);
				printConsts(c);
			} catch (ClassNotFoundException cnfe) {
				System.out.println(args[0] + " DOES NOT EXISTS...");
			}
		}
	}

	static void printConsts(Class c) {
		java.lang.reflect.Constructor Cons[] = c.getConstructors();
		System.out.println("NUMBER OF CONSTRUCTORS = " + Cons.length);
		System.out.println("NAME OF THE CONSTRUCTOR : " + c.getName());
		for (int i = 0; i < Cons.length; i++) {
			System.out.print(c.getName() + "(");
			Class cp[] = Cons[i].getParameterTypes();
			for (int j = 0; j < cp.length; j++) {
				System.out.print(cp[j].getName());
			}
			System.out.println("\b" + ")");
		}
	}
}
