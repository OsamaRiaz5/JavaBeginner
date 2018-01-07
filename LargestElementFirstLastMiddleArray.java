/*
 * Program to find the largest element from first, last and middle element in the array.
 */

import java.util.*;

public class LargestElementFirstLastMiddleArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		if (array[n - 1] > max) {
			max = array[n - 1];
		}
		if (array[n / 2] > max) {
			max = array[n / 2];
		}
		System.out.println("Largest element between first, last and middle element of an array is " + max);
		
	}
	
}
