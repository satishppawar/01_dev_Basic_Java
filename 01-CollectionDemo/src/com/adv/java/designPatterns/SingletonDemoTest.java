package com.adv.java.designPatterns;

import java.util.ArrayList;
import java.util.Arrays;

public class SingletonDemoTest {
    public static void main(String[] args) {
	//The constructor SingletonDemo() is not visible
	//SingletonDemo demo=new SingletonDemo();
	
	SingletonDemo singletonDemo=SingletonDemo.getInstance();
	singletonDemo.setTeams(new ArrayList<>(Arrays.asList("India","AUS")));
	System.out.println(singletonDemo.getTeams());
    }
}
