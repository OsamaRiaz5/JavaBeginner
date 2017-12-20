/*
 * Program to find the number of integers within the range of two specified numbers and 
 * that are divisible by another number
 */

import java.util.*;

public class DivisibleInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Min range: ");
		int min = sc.nextInt();
		System.out.println("Max range: ");
		int max = sc.nextInt();
		System.out.println("Divisible by: ");
		int num = sc.nextInt();
		
		System.out.println("A divisible number by " + num + " occurs " + divisible(min, max, num) + " times in the range.");
	}
	
	public static int divisible(int x, int y, int n) {
		if (x % n == 0) {
			return (y / n - x / n + 1);
		}
		return (y / n - x / n);
	}

}
