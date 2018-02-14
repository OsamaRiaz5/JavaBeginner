/*
 * Program to create a new array that is left shifted from the given array of integers. 
 */

import java.util.*;

public class NewArrayLeftShifted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int len = sc.nextInt();
		
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array: " + Arrays.toString(array));
		
		int[] new_array = new int[len];
		int first = array[0];
		new_array[len - 1] = first;
		for (int i = 1; i < len; i++) {
			new_array[i - 1] = array[i];
		}
		
		System.out.println("New array: " + Arrays.toString(new_array));
	}
}
