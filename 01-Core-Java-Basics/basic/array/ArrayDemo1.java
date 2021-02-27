package basic.array;

public class ArrayDemo1 {
	public static void main(String[] args) {

		// Different ways to declare a Array:-

		int[] declareValues;
		int[] declareValues1;
		int  [];

		// declaration& instantiation & initialization :-

		// Approach 1:- declaring, instantiation, initialization
		int array1[] = { 10, 20, 30, 40 };

		// Approach 2:- declaring, instantiation
		int[] array2 = new int[100];
		array2[0] = 10; // initialization
		array2[1] = 20;

		// declares an array of integers
		int[] anArray;
		// allocates memory for 10 integers
		anArray = new int[10];
		// initialize first element
		anArray[0] = 10;
		// initialize second element
		anArray[1] = 20;
		anArray[2] = 30;
		anArray[3] = 40;
		anArray[4] = 50;
		anArray[5] = 60;
		anArray[6] = 70;
		anArray[7] = 80;
		anArray[8] = 90;
		anArray[9] = 100;
		for (int i = 0; i < anArray.length; i++) {
			System.out.println("index: " + i + "\t value: " + anArray[i]);
		}
	}
}
