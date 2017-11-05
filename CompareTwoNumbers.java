/*
 * Program to compare two numbers
 */

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		num1 = sc.nextInt();
		System.out.println("Input second number: ");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.printf("%d == %d\n", num1, num2);
		}
		if (num1 != num2) {
			System.out.printf("%d != %d\n", num1, num2);
		}
		if(num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
		}
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
		}
		if (num1 >= num2) {
			System.out.printf("%d >= %d\n", num1, num2);
		}
		if (num1 <= num2) {
			System.out.printf("%d <= %d", num1, num2);
		}
	}

}
