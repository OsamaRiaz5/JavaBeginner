/*
 * Program to convert binary to decimal number
 */

import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		int i = 1, j, dec, quot, rem;
		int[] bin = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input decimal number: ");
		dec = sc.nextInt();
		
		quot = dec;
		
		while (quot != 0) {
			bin[i++] = quot % 2;
			quot = quot / 2;
		}
		
		System.out.print("Binary number is: ");
		for (j = i - 1; j>0; j--) {
			System.out.print(bin[j]);
		}
		System.out.println("\n");
		
	}

}
