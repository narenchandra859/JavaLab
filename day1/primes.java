import java.util.*;
import java.math.*;

public class primes{
	public static void main(String args[]){
		System.out.println("50 Prime numbers: ");
		printPrimes obj = new printPrimes();
		obj.priP();
	}
}

class printPrimes{
	public static void priP() {
		int count = 0;
		long i = 0;
		while(count!=50) {
			i = i + 1;
			BigInteger a = new BigInteger(String.valueOf(i)); 
			if(a.isProbablePrime(1)) {
				count = count + 1;
				System.out.println(a);
			}
		}
	}
}
