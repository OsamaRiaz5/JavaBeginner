/*
 * Program to check if the number of 10 is greater than number to 20's in a given array
 * of integers
 */

import java.util.*;

public class OccursNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < n; i++) {
			if (array[i] == 10) {
				count1++;
			}
			
			if (array[i] == 20) {
				count2++;
			}
		}
		
		if (count1 > count2) {
			System.out.println("10 occurs more often than 20");
		} else if (count2 > count1) {
			System.out.println("20 occurs more often than 10");
		} else {
			System.out.println("10 and 20 occurs the same number of times");
		}
		
	}
}
