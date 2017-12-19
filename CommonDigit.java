/*
 * Program that accepts two integer values between 25 and 75 and return true if there is a common digit in both numbers.
 */

import java.util.*;

public class CommonDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int a = sc.nextInt();
		System.out.println("Input second integer: ");
		int b = sc.nextInt();
		System.out.println("Common digit: " + common_digit(a, b));
	}
	
	public static boolean common_digit(int p, int q) {
		if ((p <= 25) || (q >= 75)) {
			return false;
		}
		
		int x = p % 10;
		int y = q % 10;
		
		p /= 10;
		q /= 10;
		
		return ((p == q) || (p == y) || (x == q) || (x == y));
	}

}
