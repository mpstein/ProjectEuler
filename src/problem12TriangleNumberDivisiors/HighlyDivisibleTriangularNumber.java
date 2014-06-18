package problem12TriangleNumberDivisiors;

public class HighlyDivisibleTriangularNumber {
	
	
	
	public static void main(String[] args) {

		System.out.println("Don't run this. It takes forever. Seriously, forever.");
		
		int numDivisors = 0;
		long internalNumber = 0;
		int count = 1;
		
		while (true) 
		{
			internalNumber = 0;
			numDivisors = 0;
			for (int sum = count; sum >= 0; sum --)
			{
				internalNumber = internalNumber + sum;
			}
			
			for (int divisor = 1; divisor <= internalNumber; divisor ++)
			{
				if (internalNumber % divisor == 0) numDivisors ++;
			}
//			System.err.println("The number being tested is: " + internalNumber + ". The number of Divisors is: " + numDivisors);
			if (numDivisors >= 500)
			{
				System.out.println("The number with > 500 Divisors is " + internalNumber);
				break;
			}
			count ++;
		}
	}
}
