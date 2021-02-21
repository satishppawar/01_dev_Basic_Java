package demo.java.basic.arrays;
//Example:- finding null index values.
public class ArrayDemo6 {
	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = "ratan";
		str[1] = "anu";
		str[2] = null;
		str[3] = "sravya";
		str[4] = null;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				System.out.println(i);
			}
		}
	}
}
