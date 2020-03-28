package core.java.demo.dataTypes;

public class ImplicitTypeCastingDemo {
	public static void main(String[] args) {
		byte b=100;
		//implicit type casting
		int i=b;
		System.out.println("i= "+i);
		
		long l=i;
		System.out.println("l= "+l);
		
		char ch='A';
		int x=ch;
		System.out.println("x= "+x);
		
	}
}
