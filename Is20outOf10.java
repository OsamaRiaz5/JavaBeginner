/*
 * Program to check if there is a 10 in a given array of integers with a 20 somewhere later
 * in the array. 
 */

import java.util.*;

public class Is20outOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			array[i] = sc.nextInt();
		}
		boolean result = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 10) {
				result = true;
				}
			if (result && array[i] == 20) {
				System.out.println(true);
				return;
			}
		}
		System.out.println(false);
	}
}
