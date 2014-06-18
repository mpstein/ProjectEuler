package problem5SumSquaredDiff;
public class SumSquaredUsingLongs {

	//The sum of the squares of the first ten natural numbers is,
	//12 + 22 + ... + 102 = 385
	//The square of the sum of the first ten natural numbers is,
	
	//(1 + 2 + ... + 10)2 = 552 = 3025
	//Hence the difference between the sum of the squares of the 
	//first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

	//Find the difference between the sum of the squares of the 
	//first one hundred natural numbers and the square of the sum.


	
	
	public static void main(String[] args) {
		int start = 1;
		int last = 100;
		// sumOfSquares(start, last) - squareOfSums(start, last)
		long sumOfSquauresResult = sumOfSquares(start, last);
		long squareOfSumsResult = squareOfSums(start, last);
		System.out.println("Value of Square of Sums = " + squareOfSumsResult);
		System.out.println("Value of Sum of Square = " + sumOfSquauresResult);
		System.out.println(sumOfSquauresResult - squareOfSumsResult);
	}

	public static long squareOfSums(int start, int last) {
		System.err.println("Entering squareOfSums with " + start + " and " + last);
		long result = 0;
		for (int natNumber = start; natNumber <= last; natNumber++) 
		{
			result = result + (natNumber * natNumber);
		}
		return result;
	}
	
	public static long sumOfSquares(int start, int last) {
		System.err.println("Entering sumOfSquares with " + start + " and " + last);
		long result = 0;
		for (int natNumber = start; natNumber <= last; natNumber ++)
		{
			result = result + natNumber;
		}
		return (result * result);
	}
}
