package problem10SumOfPrimes;

public class SumOfPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long maxPrime = 0;
		boolean prime = false;
		primeloop:
		for (int numberTested = 2; numberTested <= 2000000; numberTested++){
//			System.err.println("This is testing :" + numberTested);
			prime = false;
			if (numberTested == 2 || numberTested == 3)
			{
				System.err.println("This is a prime, yes?  " + numberTested);
				maxPrime = maxPrime + numberTested;
				continue;
			}
			if (numberTested % 2 == 0)
			{
				continue;
			}
			for (int i = 3; i <= (int)Math.sqrt(numberTested) + 1 ; i=i+2)
			{
				if (numberTested % i == 0)
				{
					continue primeloop;
				} else
				{
					prime = true;
				}
			}
			if (prime == true)
			{
			//	System.err.println("This is a prime, yes?  " + numberTested);
				maxPrime = maxPrime + numberTested;
			}
		}
		System.out.println(maxPrime);
		System.out.println("It should be: 142913828922");
	}	
}