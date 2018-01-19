/*
 * Program to create an array of string values. 
 */

import java.util.*;

public class ArrayOfStringValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of element an array: ");
		int n = sc.nextInt();
		
		String[] array = new String[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = String.valueOf(i);
		}
		
		System.out.println("Array: " + Arrays.toString(array));
	}
}
