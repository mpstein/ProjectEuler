package problem10SumOfPrimes;

import java.util.ArrayList;

public class SomeoneElsesCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long st = System.nanoTime();
		long total = 2;
		ArrayList <Integer> primes = new ArrayList<>();
		primes.add(2);
		for (int i = 3; i < 2000000; i += 2) {
		    boolean flag = false;
		    for (int temp : primes) {
		        if (i % temp == 0) {
		            flag = true;
		            break;
		        }
		        if (temp > Math.sqrt(i)) break;
		    }
		    if (!flag) {
		        primes.add(i);
		        total += i;
		    }
		}
		System.err.println(total + ", " + (System.nanoTime() - st) + " nanosecs");
	}

}
