package com.in28minutes.java.oops.inheritance.reuse;

import java.util.ArrayList;
import java.util.List;

public class TestReuse {
	public static void main(String[] args) {
		Hero hero = new Hero();
		// act method inherited from Actor
		hero.act();// Act
		hero.fight();// fight

		Comedian comedian = new Comedian();
		// act method inherited from Actor
		comedian.act();// Act
		comedian.performComedy();// Comedy

		// Super class reference variable can hold
		// an object of sub class
		Actor comedianActor = new Comedian();
		comedianActor.act();
		//comedianActor.performComedy(); //COMPILATION ERROR as at compile time it knows Actor methods only
		
		Actor actor2 = new Hero();

		// Object is super class of all java classes
		Object object = new Hero();
		//At compile time it knows ArrayList methods only
		ArrayList<Object> s =new ArrayList<Object>();
		s.add(object);
		s.add(object);
		System.out.println("Uses java.util.ArrayList.size()"+s.size());
		
		//At compile time it knows List methods only
		List<Object> ls =new ArrayList<Object>(); 
		ls.add(object);
		ls.add(object);
		
		System.out.println("Uses java.util.List.size()"+ls.size());
	}
}