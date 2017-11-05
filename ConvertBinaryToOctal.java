/*
 * Program to convert binary number to octal number
 */

import java.util.Scanner;

public class ConvertBinaryToOctal {
	public static void main(String[] args) {
		int bin, bin_temp, dec = 0, temp, quot, i = 1, j;
		int[] octal = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number: ");
		bin = sc.nextInt();
		bin_temp = bin;
		
		while (bin != 0) {
			temp = bin % 10;
			dec = dec + temp * i;
			i = i * 2;
			bin = bin / 10;
		}
		
		i = 1;
		quot = dec;
		
		while (quot > 0) {
			octal[i++] = quot % 8;
			quot = quot / 8;
		}
		
		System.out.print("Equivalent octal value of " + bin_temp + " is ");
		for (j = i - 1; j > 0; j--) {
			System.out.println(octal[j]);
		}
	}
}
