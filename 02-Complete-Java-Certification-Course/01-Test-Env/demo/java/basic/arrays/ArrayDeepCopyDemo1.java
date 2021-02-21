package  demo.java.basic.arrays;

import org.apache.commons.lang3.SerializationUtils;

public class ArrayDeepCopyDemo1 {
	public static void main(String[] args) {
		/*
		 * Learn to create deep copy of an array in Java with example. We will be using
		 * Apache Commons Lang library and it’s utility method SerializationUtils.clone(
		 * array ) to array deep copy.
		 */
		Employee[] empArr = new Employee[2]; // Original array

		empArr[0] = new Employee(100, "Lokesh", "Gupta", new Department(1, "HR"));
		empArr[1] = new Employee(200, "Pankaj", "Kumar", new Department(2, "Finance"));

		Employee[] clonedArray = SerializationUtils.clone(empArr); // Deep copied array

		// Verify the change in original array - CHANGED
		System.out.println("Original empArr[0]= " + empArr[0]);
		System.out.println("---------------------------------\n");

		// Change state of original array
		empArr[0].setFirstName("Unknown");

		// Change state of using shallow copy array
		Employee[] shallowCopiedArray = empArr.clone();
		shallowCopiedArray[0].getDepartment().setName("Unknown");
		System.out.println("Verify the change in original array empArr[0] - CHANGED");
		System.out.println(empArr[0].getFirstName()); // Unknown
		System.out.println(empArr[0].getDepartment().getName()); // Unknown
		
		System.out.println("---------------------------------\n");

		System.out.println("Verify the change in deep copied array - UNCHANGED");
		System.out.println(clonedArray[0].getFirstName()); // Lokesh
		System.out.println(clonedArray[0].getDepartment().getName()); // HR
	}
}
