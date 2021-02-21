package demo.java.basic.arrays;

/*
 * Pre-increment & post increment :-
Pre-increment :- it increases the value by 1 then it will execute statement.
Post-increment :-it executes the statement then it will increase value by 1.

 */
public class ArrayIncreamentDemo {
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
