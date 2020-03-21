package demo.basicJava.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(new String());
		arrayList.add(new String());
		System.out.println(arrayList.toString()+ " has size "+arrayList.size());
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(numbers.toString()+" has size "+numbers.size());

	}
}
