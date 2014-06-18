package problem4Palindrome;

public class palindrome {

	//This A palindromic number reads the same both ways.
	//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	//Find the largest palindrome made from the product of two 3-digit numbers.


	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int max = 0;
		int intermediateResult = 0;
		for (int i = 100; i <= 999; i++){
			for (int j = 100; j <= 999; j++){
				intermediateResult = i * j;
//				System.err.println("Testing: " + i + " * " + j + " = " + intermediateResult);
//		intermediateResult = 266662;
				if (isPalindrome(Integer.toString(intermediateResult)) && intermediateResult > max){
					max = intermediateResult;	
				}
			}
		}
		System.out.println(max);
		//266662
	}

	public static boolean isPalindrome(String testString){
//		System.err.println("Palindrome Check on: " + testString);
//		System.err.println("String Length " + testString.length());
		if (testString.length() == 0 || testString.length() ==1 )
			{
				System.err.println("TRUE!");
				return true;
			} 
//		System.err.println("Testing this substring: " + testString.substring(0,1) + " through " + testString.substring(testString.length()-1, testString.length()));
		if ((testString.substring(0,1)).equals(testString.substring(testString.length()-1, testString.length())))
			{
//				System.err.println("Testing this substring: " + testString.substring(0,1) + " through " + testString.substring(testString.length()-1, testString.length()));
				return isPalindrome((testString.substring(1, testString.length() - 1)));
			} 
//		System.err.println("Am I getting here?");
		return false;
	}
	
}
