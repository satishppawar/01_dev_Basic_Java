package basic.array;

public class ArrayDemo5DefaultValues {

	public static void main(String[] args) {
		Emp[] e = new Emp[5];
		e[0] = new Emp(111, "ratan");
		e[1] = new Emp(222, "anu");
		e[2] = new Emp(333, "sravya");
		for (Object ee : e) {
			if (ee instanceof Emp) {
				Emp eee = (Emp) ee;
				System.out.println(eee.i + "----" + eee.name);
			}
			if (ee == null) {
				System.out.println(ee);
			}
		}
	}

}
