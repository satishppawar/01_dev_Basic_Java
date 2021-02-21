package demo.java.basic.arrays;

//Example:- adding the objects into Array and printing the objects.
public class ArrayDemo4 {
	public static void main(String[] args)
	{ int[] a = new int[5];
	a[0]=111;
	for (int a1:a)
	{ System.out.println(a1);
	}
	Emp e1 = new Emp(111,"ratan");
	Emp e2 = new Emp(222,"anu");
	Emp e3 = new Emp(333,"sravya");
	Emp[] e = new Emp[5];
	e[0]=e1;
	e[1]=e2;
	e[2]=e3;
	for (Emp ee:e)
	{ System.out.println(ee); }
	}
}
