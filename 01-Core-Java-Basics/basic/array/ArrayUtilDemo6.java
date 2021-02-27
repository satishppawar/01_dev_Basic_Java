package basic.array;

//Example :-//post increment
public class ArrayUtilDemo6 {

	public static void main(String[] args) { // post increment
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a++); // 10
		System.out.println(a); // 11
		// pre increment
		int b = 20;
		System.out.println(b); // 20
		System.out.println(++b); // 21
		System.out.println(b); // 21
		System.out.println(a++ + ++a + a++ + ++a);
		// 11 13 13 15
	}

}
