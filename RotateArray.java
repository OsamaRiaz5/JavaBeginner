/*
 * Program to rotate an array of integers in left directions.
 */

import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element.");
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		System.out.println("Original string: " + Arrays.toString(arr));
		
		int[] arr2 = new int[n];
		for (int i = 0; i < arr.length - 1; i++) {
			arr2[i] = arr[i + 1];
		}
		arr2[n - 1] = temp;
		System.out.println("Rotate string: " + Arrays.toString(arr2));
		
		
		int[] arr3 = new int[n];
		for (int i = 0; i < n; i++) {
			arr3[i] = arr[arr.length - i - 1];
		}
		System.out.println("Reverse array: " + Arrays.toString(arr3));
	}
}
