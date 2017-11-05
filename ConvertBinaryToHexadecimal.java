/*
 * Program to convert binary number to hexadecimal number
 */

import java.util.Scanner;

public class ConvertBinaryToHexadecimal {
	public static void main(String[] args) {
		int bin, dec = 0, rem, i = 1, j = 0;
		int[] hex = new int[1000];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number: ");
		bin = sc.nextInt();
		
		while (bin != 0) {
			rem = bin % 10;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		System.out.println("Decimal is " + dec);
		i = 0;
		
		while (dec != 0) {
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		
		System.out.print("Hexadecimal is ");
		for (j = i - 1; j >= 0; j--) {
			if (hex[j] > 9) {
				System.out.println((char)(hex[j] + 55));
			} else {
				System.out.println(hex[j]);
			}
			
		}
	}

}
