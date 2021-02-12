package common.java.utils;

public class SrtingDemo {
	public static void main(String[] args) {
		String str = "Mahesh";
		System.out.println("hascode of str with value " + str + " is " + str.hashCode());
		
		System.out.println(str.concat(" Pawar").hashCode());
		
		System.out.println("hascode of str with value " + str + " is " + str.hashCode());
		if (str.equalsIgnoreCase("Mahesh Pawar")) {
			System.out.println("Inside if");
			System.out.println("hascode of str with value " + str + " is " + str.hashCode());
		}
		System.out.println("Good Bye!");
	}
}
