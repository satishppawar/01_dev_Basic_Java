package core.java.demo.array;

public class MultiDimentionalArrayDemo1 {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(a[0][0]);// 10
		System.out.println(a[1][0]);// 40
		System.out.println(a[1][1]);// 50

		String[][] str = { { "A.", "B.", "C." }, { "ratan", "ratan", "ratan" } };
		System.out.println(str[0][0] + str[1][0]);
		System.out.println(str[0][1] + str[1][1]);
		System.out.println(str[0][2] + str[1][2]);
	}
}
