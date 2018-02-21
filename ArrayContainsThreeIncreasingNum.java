/*
 * Program to check if an array contains three increasing numbers.
 */

import java.util.*;

public class ArrayContainsThreeIncreasingNum {

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
		int result = 0;
		for (int i = 0; i < len - 2; i++) {
			if ((array[i] + 1 == array[i + 1]) && (array[i] + 2 == array[i + 2])) {
				result = 1;
			}
		}
		
		if (result == 1) {
			System.out.println("Array contains three increasing number");
		} else {
			System.out.println("Array don't contains three increasing number");
		}
		
	}
}
