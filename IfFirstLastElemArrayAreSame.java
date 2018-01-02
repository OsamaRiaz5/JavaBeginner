/*
 * Program to test if the first and last element of an array are same. The length of an array must be equal or greater than two.
 */

import java.util.*;

public class IfFirstLastElemArrayAreSame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements in array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		if (n < 2) {
			System.out.println("The length of an array must be longer than one element.");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println("Input an " + (i + 1) + " element: ");
				arr[i] = sc.nextInt();
			}
			System.out.println(arr[0] == arr[arr.length - 1]); 
		}
	}

}
