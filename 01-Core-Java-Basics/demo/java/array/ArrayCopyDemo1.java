package demo.java.array;

//Example :- copy the data from one array to another array
public class ArrayCopyDemo1 {
	public static void main(String[] args) {
		int[] copyfrom = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int size = copyfrom.length;
		int[] copyto = new int[size];
		// arraycopy(Object src, int srcPos,Object dest, int destPos,int length)
		System.arraycopy(copyfrom, 0, copyto, 0, size);
		for (int cc : copyto) {
			System.out.println(cc);
		}
	}
}
