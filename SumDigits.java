/*
 * Program that compute the sum of digits of an integer
 */

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer number: ");
		long num = sc.nextLong();
		
		System.out.println("The sum of digits is " + digitsSum(num));
	}
	
	public static int digitsSum (long n) {
		int sum = 0;
		while (n != 0) {
			sum +=n % 10;
			n /= 10;
		}
		return sum;
	}

}
