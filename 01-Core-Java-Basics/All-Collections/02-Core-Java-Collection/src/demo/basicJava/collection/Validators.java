package demo.basicJava.collection;

import java.util.regex.Pattern;

public class Validators {
    public static void main(String[] args) {
	String account = "awdvsfdv";
	Pattern pattern = Pattern.compile(".*[^0-9].*");
	
	// Integer accountId=Integer.parseInt(account);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(pattern.matcher(account).matches());

	// Pattern pattern = Pattern.compile(".*\\D.*");
	String[] inputs = { "123", "-123", "123.12", "abcd123", "dvsdsv", "123davcsdv" };

	for (String input : inputs) {
	    System.out.println("does " + input + " is number : " + !pattern.matcher(input).matches());
	}
    }
}
