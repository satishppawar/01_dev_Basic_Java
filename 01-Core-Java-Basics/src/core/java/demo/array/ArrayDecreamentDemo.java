package core.java.demo.array;

/*Pre-decrement &postdencrement :-
Pre-decrement :- it decreases the value by 1 then it will execute statement.
Post-decrement :-it executes the statement then it will increase value by 1.
 */
public class ArrayDecreamentDemo {
	public static void main(String[] args) { // post decrement
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a--); // 10
		System.out.println(a); // 9
		// post decrement
		int b = 20;
		System.out.println(b); // 20
		System.out.println(--b); // 19
		System.out.println(b); // 19
		System.out.println(a-- + --a + a-- + --a);
		// 9 7 7 5
	}
}
