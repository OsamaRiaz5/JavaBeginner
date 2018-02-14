/*
 * Program to add all digits from a given positive integer until the result has 
 * a single digit.
 */

import java.util.*;

public class AddDigitsToSingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer: ");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("The single digit number is: " + (n == 0 ? 0 : ( n % 9 == 0 ? 9 : n % 9)));
		}
		
	}
}
