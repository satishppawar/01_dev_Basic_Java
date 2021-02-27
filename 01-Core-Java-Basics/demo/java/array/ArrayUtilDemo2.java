package demo.java.array;

//Example:-process of adding different types Objects in Object array
public class ArrayUtilDemo2 {

	public static void main(String[] args) {
		Object[] a = new Object[6];
		a[0] = new Emp(111, "ratan");
		a[1] = new Integer(10);
		a[2] = new Student(1, "anu");
		for (Object a1 : a) {
			if (a1 instanceof Emp) {
				Emp e1 = (Emp) a1;
				System.out.println(e1.i + "---" + e1.name);
			}
			if (a1 instanceof Student) {
				Student s1 = (Student) a1;
				System.out.println(s1.sid + "---" + s1.sname);
			}
			if (a1 instanceof Integer) {
				System.out.println(a1);
			}
			if (a1 == null) {
				System.out.println(a1);
			}
		}
	}
}
