package problem7PrimeThing;

import java.lang.Math;

public class PrimeCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int primeNumber = 0;
		int numberTested = 1;
		int maxPrime = 0;
		boolean prime = false;
		primeloop:
		while (primeNumber <= 10001){
			prime = false;
//			System.err.println("Entering loop testing: " + numberTested);
	//		System.err.println("This is prime number: " +primeNumber);
			if (numberTested == 1 || numberTested == 2 || numberTested == 3)
			{
				primeNumber=primeNumber + 1;
				maxPrime = numberTested;
				numberTested=numberTested + 1;
				prime = true;
				continue;
			}	
			for (int i = 2; i <= (int)Math.sqrt(numberTested) ; i++)
			{
				if (numberTested % i == 0)
				{
					prime = false;
					numberTested = numberTested + 1;
					continue primeloop;
				} else
				{
					prime = true;
				}
			}
			if (prime == true)
			{
				maxPrime = numberTested;
				primeNumber = primeNumber + 1;
				numberTested = numberTested + 1;
			}
		}
		System.out.println(maxPrime);
	}

}
