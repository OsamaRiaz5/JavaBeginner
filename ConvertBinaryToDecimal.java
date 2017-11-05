/*
 * Convert binary number to decimal number
 */

import java.util.Scanner;

public class ConvertBinaryToDecimal {
	public static void main(String[] args) {
		long bin, dec = 0, j = 1, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number:");
		bin = sc.nextLong();
		
		while (bin != 0) {
			rem = bin % 10;
			dec = dec + rem * j;
			j = j * 2;
			bin = bin / 10;
		}
		System.out.println("Decimal is " + dec);
	}

}
