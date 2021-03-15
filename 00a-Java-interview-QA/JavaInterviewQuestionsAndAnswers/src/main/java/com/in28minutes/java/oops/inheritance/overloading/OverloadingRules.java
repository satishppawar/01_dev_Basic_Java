package com.in28minutes.java.oops.inheritance.overloading;

//A method having the same name as another method (in same class or a sub class) but having different
//parameters is called an Overloaded Method.
public class OverloadingRules {
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.doIt(10);
		foo.doIt(10L);
	}
}

class Foo {
	public void doIt(int number) {
		System.out.println("Inside Foo doIt::int");
	}

	public void doIt(long number) {
		System.out.println("Inside Foo doIt::long");
	}
}

class Bar extends Foo {
	public void doIt(String str) {
		System.out.println("Inside Bar doIt::String");
	}

	public void doIt(float number) {
		System.out.println("Inside Bar doIt::float");
	}
}
