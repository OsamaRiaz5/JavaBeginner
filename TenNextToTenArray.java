/*
 * Program to test if an array of integers contains an element 10 next to ten or an element 20 next to 20, but not both.
 */

import java.util.*;

public class TenNextToTenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			array[i] = sc.nextInt(); 
		}
		
		boolean nextTo1010 = false;
		boolean nextTo2020 = false;
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 10 && array[i + 1] == 10) {
				nextTo1010 = true;
			}
			if (array[i] == 20 && array[i + 1] == 20) {
				nextTo2020 = true;
			}
		}
		System.out.printf(String.valueOf(nextTo1010 != nextTo2020));
		
	}
}
