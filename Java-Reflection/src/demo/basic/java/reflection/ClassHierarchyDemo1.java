package demo.basic.java.reflection;

import java.lang.reflect.Constructor;

public class ClassHierarchyDemo1 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("PLEASE PASS THE CLASS NAME..!");
		} else {
			try {
				Class c = Class.forName(args[0]);
				printHierarchy(c);
			} catch (ClassNotFoundException cnfe) {
				System.out.println(args[0] + " DOES NOT EXISTS...");
			}
		}
	}

	static void printHierarchy(Class c) {
		Class c1 = c;
		String cname = c1.getName();
		Constructor cons []=c1.getConstructors ();
		System.out.println ("NUMBER OF CONSTRUCTORS = "+cons.length);
	
		System.out.println(cname);
		Class sc = c1.getSuperclass();
		while (sc != null) {
				cname = sc.getName();
			System.out.println(cname);
			c1 = sc;
			sc = c1.getSuperclass();
		}
	}
}
