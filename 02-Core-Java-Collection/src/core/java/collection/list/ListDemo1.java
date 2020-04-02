package core.java.collection.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List interface common properties:-
1. All List interface implementation classes allows null insertion.
2.  All classes allows duplicate objects.
3. 	All classes preserved insertion order
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		// 1. All List interface implementation classes allows null insertion.
		System.out.println("List interface common properties:-");
		list.add(null);
		list.add(234);
		list.add(null); // duplicate objects.
		list.add(123);
		System.out.println("List is :" + list);// preserved insertion order
	}
}
