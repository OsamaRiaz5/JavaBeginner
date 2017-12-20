/*
 * Program that accepts an integer and count the factors of the number.
 */

import java.util.*;

public class CountFactors {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("The number " + num + " has " + count + " factor.");
		}
		else if (count > 1) {
			System.out.println("The number " + num + " has " + count + " factors.");
		}
	}
}
