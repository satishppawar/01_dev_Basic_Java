package demo.java.basic.control;

//Eg-1:Normal input and normal output.
public class SwitchDemo1 {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("Satish");
			break;
		case 20:
			System.out.println("Mahesh");
			break;
		case 30:
			System.out.println("Suresh");
			break;
		default:
			System.out.println("No Name");
			break;
		}
	}
}
