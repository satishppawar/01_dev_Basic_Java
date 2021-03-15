package com.questions;

/**
 * Will this code compile?
 *
 */
public class Animal {
	String name;

	/*public Animal() {
		this.name = "Default Names";
	}*/

// This is called a one argument constructor.
	public Animal(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Animal animal = new Animal(); 
	}
}