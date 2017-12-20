/*
 * Program to compute the sum of the first 100 prime number
 */

public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		int count = 0;
		
		while (count < 100) {
			n++;
			if (n % 2 != 0) {
				if (isPrime(n)) {
					sum += n;
					count++;
				}
			}
			
		}
		System.out.println("Sum of the first 100 prime number is: " + sum);
		
	}
	
	public static boolean isPrime(int n) {
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
