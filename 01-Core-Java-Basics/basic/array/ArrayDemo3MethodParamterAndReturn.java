package basic.array;

public class ArrayDemo3MethodParamterAndReturn {
	static void m1(int[] a) // method parameter is array
	{
		for (int a1 : a) {
			System.out.println(a1);
		}
	}

	static int[] m2() // method return type is array
	{
		System.out.println("m1 method");
		return new int[] { 100, 200, 300 };
	}

	public static void main(String[] args) {
		ArrayDemo3MethodParamterAndReturn.m1(new int[] { 10, 20, 30, 40 });
		int[] x = ArrayDemo3MethodParamterAndReturn.m2();
		for (int x1 : x) {
			System.out.println(x1);
		}
	}

}
