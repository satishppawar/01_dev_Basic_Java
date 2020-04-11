package demo.basicJava.collection;

import org.apache.commons.lang3.EnumUtils;

public class EnumUtilsDemo {
	public static void main(String[] args) {
		// Is PY("Python") a part of the enum?
		System.out.println(EnumUtils.isValidEnum(MathCodes.class, "PY"));

		System.out.println("For enum" + MathCodes.CA + " name is " + MathCodes.CA.getName());

		// Is CA("Calculus") a part of the enum?
		System.out.println(EnumUtils.isValidEnum(MathCodes.class, MathCodes.CA.toString()));
	}
}

enum MathCodes {
	LA("Linear Algebra"), CA("Calculus"), PB("Probability"),PY("Python");

	private String mathSubject;

	private String name;

	private MathCodes(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}