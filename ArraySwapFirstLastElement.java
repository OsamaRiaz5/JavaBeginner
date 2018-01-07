/*
 * Program to swap the first and last element of an array and create a new array.
 */

import java.util.*;

public class ArraySwapFirstLastElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array " + Arrays.toString(array));
		int[] array_swap = new int[n];
		array_swap = array;
		int temp = array[0];
		array_swap[0] = array[n - 1];
		array_swap[n - 1] = temp;
		System.out.println("New array after swapping first and last element: " + Arrays.toString(array_swap));
	}
}
