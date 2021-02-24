package demo.java.basic.control;

//Ex-2:-Inside the switch the case labels must be unique; 
//if we are declaring duplicate case labels the compiler will raise compilation error “duplicate case label”.
public class SwitchDemo2 {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
		case 10: // compilation error “duplicate case label”
			System.out.println("Satish");
			break;
		case 10: // must be unique
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