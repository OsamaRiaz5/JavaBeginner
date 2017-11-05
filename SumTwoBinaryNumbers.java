/*
 * Program to add two binary numbers
 */

import java.util.Scanner;

public class SumTwoBinaryNumbers {
	public static void main(String[] args) {
		int remainder = 0, i = 0;
		int[] sum = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first binary number: ");
		long bin1 = sc.nextLong();
		System.out.println("Input second binary number: ");
		long bin2 = sc.nextLong();
		
		while (bin1 != 0 || bin2 !=0) {
			sum[i++] = (int) ((bin1 % 10 + bin2 % 10 + remainder) % 2);
			remainder = (int) ((bin1 % 10 + bin2 % 10 + remainder) /2);
			bin1 = bin1 / 10;
			bin2 = bin2 / 10;
		}
		
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		
		--i;
		System.out.println("Sum of two binary numbers is: ");
		
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");
		
	}

}
