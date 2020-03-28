package core.java.demo.dataTypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		// byte b=140;
		byte b = -50;
		short s = 150;
		int i = 100000;
		long l = 100000000;
		char c = 'A';

		float f = 1.23f;
		double d = 1234.3242;

		byte h = 20;
		// byte result =h+b;
		int result = (byte) h + b; //Explicit casting

		System.out.println("byte is:" + b);
		System.out.println("short is:" + s);
		System.out.println("int is:" + i);
		System.out.println("long is:" + l);
		System.out.println("char is:" + c);
		System.out.println("float is:" + f);
		System.out.println("double is:" + d);
	}
}
