package com.questions;

/*
 * A child class can define abstract methods with the same or less restrictive visibility, whereas a
class implementing an interface must define all interface methods as public
 */
abstract class A {
	abstract protected void printA();
}

interface B {
	void printB();
}

public class AbstractClassDemo extends A implements B {

	@Override
	void printA() { // same or less restrictive visibility than parent
		System.out.println("From abstract class A");

	}

	@Override
	void printB() { // must define all interface methods as public
		System.out.println("From interface B");

	}

}
