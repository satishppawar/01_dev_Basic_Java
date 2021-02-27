package demo.java.staticdemo;

// Ex -Static Block get executed top to bottom

/**
 * Static block is used for initiliazing the static variables.This block gets
 * executed when the class is loaded in the memory. A class can have multiple
 * Static blocks, which will execute in the same sequence in which they have
 * been written into the program.
 *
 *
 */

public class StaticDemo1 {
	static int num;
	static String mystr;
	
	static {
		System.out.println("Inside the static block 3");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main");
		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);
	}

	// 1. Static block executes before main method
	static {
		System.out.println("Inside the static block 1");
	}
	// 2. Static block executes sequentially
	static {
		System.out.println("Inside the static block 2");
	}
	static {
		System.out.println("###### START #######");
		System.out.println("Static block is used for initiliazing the static variables");
		num = 97;
		mystr = "Static keyword in Java";
		System.out.println("###### END #######");
	}
}
