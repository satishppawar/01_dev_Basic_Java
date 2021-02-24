package demo.java.basic.control;

//Eg-4:- Inside the switch the case label must be constant values. If we are declaring variables as a
//case labels the compiler will show compilation error “constant expression required”.
public class SwitchDemo4 {
	{
		final int a = 10; // constant expression
		int b = 20;
		int c = 30;
		switch (a) {
		case a:
			System.out.println("Satish");
			break;
		case b:// “constant expression required”.
			System.out.println("Mahesh");
			break;
		case c:
			System.out.println("Suresh");
			break;
		default:
			System.out.println("No Name");
			break;
		}
	}
}
