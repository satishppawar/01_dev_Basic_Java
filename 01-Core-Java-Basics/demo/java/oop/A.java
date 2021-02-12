package demo.java.oop;

//1 . Abstract class
abstract class A {
	abstract void hi();

}

//Class extending an abstract class should either implement the methods of the abstract class 
//or is should be declared as an abstract class too
class B extends A {
	void hi() { // implementation of an abstract class
		System.out.println("hi...");
	}

}
