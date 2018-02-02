/*
 * Program to create new array from a given array of integers, new array will contain
 * the elements from the given array before the last element value 10.
 */

import java.util.*;

public class NewArrayBefore10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		System.out.println("Original array: " + Arrays.toString(array));
		
		int l = array.length - 1;
		while (array[l] != 10) {
			l--;
		}
		int[] new_array = new int[l];
		for (int i = 0; i < l; i++) {
			new_array[i] = array[i];
		}
		System.out.println("New array: " + Arrays.toString(new_array));
	}
}
