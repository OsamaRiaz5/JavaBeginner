/*
 * Program to get the larger value between first and last element of array.
 */

import java.util.*;

public class LargestElementArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of the array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			array[i] = sc.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(array));
		int max = array[0];
		for (int i = 1; i< n; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max value: " + max);
	}
}
