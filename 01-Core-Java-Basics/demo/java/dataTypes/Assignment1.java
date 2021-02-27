package demo.java.dataTypes;

public class Assignment1 {
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);

		float f = 20.54f;
		System.out.println(f);

		char ch = 'X';
		System.out.println(ch);

		String str = "I am the best";
		System.out.println(str);
		Assignment1 assignment1 =new Assignment1();
		assignment1.testAssignment();
		
	}

	
	public void testAssignment() {
		System.out.println("Local Variable  need to be assigned before using it");
		//static int i; //local var should not be static
		int i;
		//System.out.println(i);//ERROR: Local Variable  need to be assigned before using it
		i=10;
		System.out.println(i);
	}
}
