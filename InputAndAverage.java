/*
 * Program that takes three numbers as input to calculate and print the average
 * of the numbers.
 */

import java.util.Scanner;

public class InputAndAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Input third number: ");
		int num3 = sc.nextInt();
		
		double average = (num1 + num2 + num3) / 3.0;
		
		System.out.println("The average is equal " + average);
	}
}
