package demo.java.basic.arrays;

//Method parameter is array & method return type is array:-
public class ArrayDemo3 {

	static void m1(int[] a) // method parameter is array
	{
		System.out.println("Inside m1");
		for (int a1 : a) {
			System.out.println(a1);
		}
	}

	static int[] m2() // method return type is array
	{
		System.out.println("m2 method");
		return new int[] { 100, 200, 300 };
	}

	public static void main(String[] args) {
		ArrayDemo3.m1(new int[] { 10, 20, 30, 40 });
		int[] x = ArrayDemo3.m2();
		for (int x1 : x) {
			System.out.println(x1);
		}
	}
}
