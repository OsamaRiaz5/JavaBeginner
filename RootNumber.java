/*
 * Program to compute the square root of an given integer
 */

import java.util.*;

public class RootNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int num = sc.nextInt();
		
		Double d = Math.sqrt(num);
		int result = d.intValue();
		System.out.println("Square root of " + num + " is " + result);
	}
}
