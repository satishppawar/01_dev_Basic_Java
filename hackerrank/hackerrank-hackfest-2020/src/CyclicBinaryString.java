
public class CyclicBinaryString {

	public static void main(String[] args) {

		String s = "101101001";
		int result = CyclicBinaryString.maximumPower(s);
		System.out.println("result is" + result);
	}

	/*
	 * Complete the 'maximumPower' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int maximumPower(String s) {
		// Write your code here
		int maxMove = 0;
		char currentChar = new Character(Character.MIN_VALUE);
		int zeroCount = 0;
		int oneCount = 0;
		String binaryString = "0";
		// char nextChar = new Character(Character.MIN_VALUE);;
		if (s != null) {
			if (!s.contains("0")) {
				maxMove = 0;
			} else {
				for (int i = 0; i < s.length(); i++) {
					currentChar = s.charAt(i);
					if (currentChar == '1') {
						oneCount++;
					} else if (currentChar == '0') {
						zeroCount++;
					}
				}
				// get largest number
				for (int i = 0; i < oneCount; i++) {
					binaryString += "1";
				}
				for (int i = 0; i < zeroCount; i++) {
					binaryString += "0";
				}
				int decimal=Integer.parseInt(binaryString,2);
				System.out.println("Decimal number is"+decimal);
				int maxNum=highestPowerOf2(decimal);
				System.out.println("maxNum is"+maxNum);
				maxMove = (int)(Math.log(maxNum) / Math.log(2)); 
				  
			}
		}

		return maxMove;
	}
	static int highestPowerOf2(int n) 
	{ 
	    return (n & (~(n - 1))); 
	} 
}
