/*
 * Program to check if an array of integers contains a specified number next to each other
 * or there are two same numbers separated by one element.
 */

import java.util.*;

public class ArrayIsXequalXplusTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		int n = sc.nextInt();
		int x = 10;
		
		//System.out.println("Input value: ");
		//int val = sc.nextInt();
		
		int[] array = new int[n];
		int m = array.length - 3;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		boolean result = false;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] == x && array[i + 1] == x) {
				System.out.println("array[x] == array[x + 1]");
				result = true;
			}
			if (i <= m && array[i] == x && array[i + 2] == x) {
				System.out.println("array[x] == array[x + 2]");
				result = true;
			}	
		}
		if (result != true) {
			System.out.println(result);
		}
	}
}
