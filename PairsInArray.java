/*
 * Program to check if a specified number appears in every pair of adjacent element of an array of integers
 */

import java.util.*;

public class PairsInArray {

	public static void main(String[] args) {
		int x = 10;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		//new array
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		
		//Comparison elements
		for (int i = 0; i < n - 1; i++) {
			if (array[i] != x && array[i + 1] != x) {
				result = 1;
			}
		}
		
		if (result == 0) {
			System.out.println("Specified number appears in every pair of adjacent element of an array");
		} 
		if (result == 1) {
			System.out.println("Specified number don't appears in every pair of adjacent element of an array");
		}
	}
}
