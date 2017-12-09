/*
 * Program that accepts three integers from the user and return true if two or more of them
 * have the same rightmost digit. 
 */

import java.util.*;

public class TheSameRightmostDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Input second integer: ");
		int num2 = sc.nextInt();
		System.out.println("Input third integer: ");
		int num3 = sc.nextInt();
		
		System.out.println("The result is: " + lastDigit(num1, num2, num3, true));
		
	}
	
	public static boolean lastDigit(int x, int y, int z, boolean xyz) {
		return (x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10);
	}

}
