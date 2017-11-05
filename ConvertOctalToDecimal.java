/*
 * Program to convert octal number to decimal number
 */

import java.util.Scanner;

public class ConvertOctalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long oct, dec = 0;
		int i = 0;
		System.out.println("Input any octal number: ");
		oct = sc.nextLong();
		while (oct != 0) {
			dec = (long) (dec + (oct % 10) * Math.pow(8, i++));
			oct = oct / 10;
		}
		System.out.println("Equivalent decimal number is " + dec);
	}
}
