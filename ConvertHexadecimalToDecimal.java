/*
 * Program to convert hexadecimal number to decimal number
 */

import java.util.Scanner;

public class ConvertHexadecimalToDecimal {
	public static int HexToDec(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}
	
	public static void main(String[] args) {
		String hex;
		int dec;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input hexadecimal number: ");
		hex = sc.nextLine();
		dec = HexToDec(hex);
		System.out.println("Equivalent decimal number is: " + dec);
	}
}
