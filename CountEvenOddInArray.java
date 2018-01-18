/*
 * Program to count even and odd number in array.
 */

import java.util.*;

public class CountEvenOddInArray {
	public static void main(String[] args) {
		int even = 0, odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element: ");
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}	
		}
		System.out.println("Number of even elements in an array: " + even);
		System.out.println("Number of odd elements in an array: " + odd);
	}
}
