
package demo.access.modifieres.mypack1;

public class Student {

	public Student() {
		System.out.println("Default constructor ...");
	}

	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + "]";
	}

}
