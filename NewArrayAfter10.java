/*
 * Program to create new array from a given array of integers, new array will contains the elements from the given array after the last element value 10.
 */

import java.util.*;

public class NewArrayAfter10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the lengt of an array: ");
		int len = sc.nextInt();
		
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		System.out.println("Old array: " + Arrays.toString(array));
		
		int l = array.length - 1;
		int[] new_array;
		while (array[l] != 10) {
			l--;
		}
		new_array = new int[array.length - 1 - l];
		for (int i = l + 1; i < array.length; i++) {
			new_array[i - l -1] = array[i];
		}
			
		
		System.out.println("New array: " + Arrays.toString(new_array));
	}
}
