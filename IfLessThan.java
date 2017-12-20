/*
 * Program that accepts three integers and return true if one of them is 20 or less more
 * than one of the others.
 */

import java.util.*;

public class IfLessThan {
	public static void main(String[] args) {
		boolean result = false; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Input second integer: ");
		int num2 = sc.nextInt();
		System.out.println("Input third integer: ");
		int num3 = sc.nextInt();
		
		if ((Math.abs(num1 - num2) >= 20) || (Math.abs(num1 - num3) >= 20) || (Math.abs(num2 - num3) >= 20)) {
			result = true;
		}
		
		System.out.println(result);
	}

}
