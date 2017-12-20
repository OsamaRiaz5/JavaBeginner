/*
 * Program that accepts three integers from the user and return true if second integer
 * is greater than first integer and third integer is greater than second integer
 * or only second integer is greater than third integer.
 * 
 */

import java.util.*;

public class IntGreaterThan {
	public static void main(String[] args) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int x = sc.nextInt();
		System.out.println("Input second integer: ");
		int y = sc.nextInt();
		System.out.println("Input third integer: ");
		int z = sc.nextInt();
		if (y < z || (x < y && y < z)) {
			result = true;
		}
		
		System.out.print("The result is: " + result);
	}
	
}
