package com.adv.java.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class SingletonDemo {

    private static final SingletonDemo instance = new SingletonDemo();

    private List teams = new ArrayList();

    /**
     * Constructor has been made private so that outside classes do not have access
     * to instantiate more instances of Statistics.
     */
    private SingletonDemo() {
    }

    /**
     * Accessor for the statistics class. Only allows for one instance of the class
     * to be created.
     * 
     * @return
     */
    public static SingletonDemo getInstance() {

	return instance;
    }

    /**
     * @return the teams
     */
    public List getTeams() {
	return teams;
    }

    /**
     * @param teams the teams to set
     */
    public void setTeams(List teams) {
	this.teams = teams;
    }

    protected Object readResolve() {
	return instance;
    }
}
