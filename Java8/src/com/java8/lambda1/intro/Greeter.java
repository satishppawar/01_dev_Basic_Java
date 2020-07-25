
package com.java8.lambda1.intro;

/**
 * @author Satish Pawar
 *
 */
public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);

	}

}
