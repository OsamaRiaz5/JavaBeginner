/*
 * Program to test that a given array of integers of contains a 4 or a 7.
 */

import java.util.*;

public class ArrayContainsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			arr[i] = sc.nextInt();
		}
		
		boolean result = true;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 4 || arr[i] == 7) {
				result = true;
			} else {
				result = false;
			}
		}
		System.out.println(result);
	}
}
