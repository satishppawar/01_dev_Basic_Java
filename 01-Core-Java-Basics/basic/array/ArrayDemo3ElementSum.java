package basic.array;

public class ArrayDemo3ElementSum {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		int sum = 0;
		for (int a1 : a) {
			sum = sum + a1;
		}
		System.out.println("Array Element sum is=" + sum);
	}

}
