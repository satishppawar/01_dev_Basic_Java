package mypack1;

public class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		System.out.println("Default constructor ...");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
