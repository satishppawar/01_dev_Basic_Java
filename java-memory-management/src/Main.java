public class Main {
	public static void main(String[] args) {

		int localValue = 5;
		// pass by value
		calculate(localValue);
		System.out.println(localValue);

	}

	public static void calculate(int localValue) {

		localValue = localValue * 100;

	}
}
