/*
 * Test if 10 appears as a first of last element of an array of integers. The length of an array must be greater than or equal two.
 */

import java.util.*;

public class If10IsFirstLastElementArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements in array: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println("The length of an array must be longer than one element.");
		} else {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Input an " + (i + 1) + " element: ");
				arr[i] = sc.nextInt();
			}
			
			System.out.println(arr[0] == 10 || (arr[arr.length - 1] == 10));
			}
		}		
}
