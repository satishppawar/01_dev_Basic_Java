package core.java.demo.dataTypes;

public class ExplicitCastDemo {
	public static void main(String[] args) {
		//Explicit casting
		double doubleVar = 42.0d;
		float floatVar = (float) doubleVar;
		long longVar = (long) floatVar;
		int intVar = (int) longVar;
		short shortVar = (short) intVar;
		byte byteVar = (byte) shortVar;
		
		int i = 100;
		byte b = (byte) i;

		System.out.println("b=" + b);

		int x = 97;
		char ch = (char) x;
		System.out.println("ch is " + ch);

		int y = 130;
		byte z = (byte) y;

		// Explicit type casting

		System.out.println("z=" + z); // -126

		int m = 612;
		byte n = (byte) m;
		char o = (char) n;

		System.out.println("o=" + o); // d

		float f = 99f;
		double d = f;

		System.out.println("d=" + d); // d
		
		
	}
}
