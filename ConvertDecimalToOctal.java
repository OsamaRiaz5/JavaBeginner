/*
 * Program to convert decimal to octal number
 */

import java.util.Scanner;

public class ConvertDecimalToOctal {
	public static void main(String[] args) {
		int dec, i = 1, j, rem, quot;
		int[] oct = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input decimal number: ");
		dec = sc.nextInt();
		
		quot = dec;
		
		while (quot != 0) {
			oct[i++] = quot % 8;
			quot = quot / 8;
		}
		
		System.out.print("Octal is ");
		for(j = i -1; j > 0; j--) {
			System.out.print(oct[j]);
		}
	}

}
