package demo.java.basic.arrays;
//Finding minimum & maximum element of the array:-
public class ArrayDemoMinMax {
	public static void main(String[] args) {
		
		int[] a = new int[] { 10, 20, 5, 70, 4 };
		
		for (int a1 : a) {
			System.out.println(a1);
		}
		// minimum element of the Array
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("minimum value is =" + min);
		// maximum element of the Array
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("maximum value is =" + max);
	}
}
