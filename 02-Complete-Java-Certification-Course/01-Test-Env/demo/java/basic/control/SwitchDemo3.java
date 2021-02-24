package demo.java.basic.control;

//Ex-3:Inside the switch for the case labels it is possible to provide expressions(10+10+20 , 10*4 , 10/2).
public class SwitchDemo3 {
	public static void main(String[] args) {
		{
			int a = 100;
			switch (a) {
			case 10 + 20 + 70:
				System.out.println("Satish");
				break;
			case 10 + 5:
				System.out.println("Mahesh");
				break;
			case 30 / 6:
				System.out.println("Suresh");
				break;
			default:
				System.out.println("No Name");
				break;
			}
		}

	}
}
