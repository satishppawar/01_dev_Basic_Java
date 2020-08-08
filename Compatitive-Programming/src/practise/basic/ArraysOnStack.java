package practise.basic;

import java.util.Stack;

public class ArraysOnStack {
	public static void main(String[] args) {
		int sizeOfArray = 5;
		Stack<int[]> stack = fillStackWithArray(5);
		printStack(stack);
	}

	private static void printStack(Stack<int[]> stack) {
		int[] arr;
		while (!stack.empty()) {

			arr = stack.pop();
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	private static Stack<int[]> fillStackWithArray(int size) {
		Stack<int[]> stack = new Stack<>();
		int[] arr = new int[size];
		// Some Operation that fills Stack with Arrays.
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[j] = size - i;
				System.out.print(arr[j]+" ");
			
			}
			System.out.println();
			// Pushing the array into stack on which some operation
			// is performed.
			stack.push(arr);
		}

		return stack;
	}
}