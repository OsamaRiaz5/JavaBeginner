/*
 * Program thac calculate the sum of two integers and return true if the sum is equel
 * to a third number.
 */

import java.util.Scanner;

public class SumIsEqual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Input second integer: ");
		int num2 = sc.nextInt();
		System.out.println("Input third integer: ");
		int num3 = sc.nextInt();
		
		System.out.printf("The result is: " + sum(num1, num2, num3));
	}
	
	public static boolean sum(int x, int y, int z) {
		return ((x + y) == z || (x + z) == y || (y + z) == x);
	}

}
