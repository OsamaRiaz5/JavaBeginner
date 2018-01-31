/*
 * Program to check if an array contains 10's and 30's.
 */

import java.util.*;

public class ArrayContains10And30 {

	public static void main(String[] args) {
		int result = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the lengt of an array: ");
		int len = sc.nextInt();
		
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < len; i++) {
			if (array[i] == 10 || array[i] == 30) {
				result = 1;
				count++;
			}
		}
		System.out.printf(String.valueOf(result));
		System.out.println("\nElement 10 or 30 in the array: " + count);
	}
}
