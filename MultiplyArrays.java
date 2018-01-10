/*
 * Program to multiply corresponding elements of two arrays of integers.
 */

import java.util.*;

public class MultiplyArrays {
	public static void main(String[] args) {
		
		int sum = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an arrays: ");
		int n = sc.nextInt();
		
		int[] array1 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element first array: ");
			array1[i] = sc.nextInt();
		}
		
		int[] array2 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Input " + (i + 1) + " element second array: ");
			array2[i] = sc.nextInt();
		}
		
		System.out.println("First array: " + Arrays.toString(array1));
		System.out.println("Second array: " + Arrays.toString(array2));
		
		for (int i = 0; i < n; i++) {
			int num1 = array1[i];
			int num2 = array2[i];
			sum += num1 * num2;
			result += Integer.toString(num1 * num2) + " ";
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Result: " + result);
		
		
	}

}
