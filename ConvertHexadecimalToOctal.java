/*
 * Program to convert hexadecimal number to octal number
 */

import java.util.Scanner;

public class ConvertHexadecimalToOctal {
	public static int HexToDec(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = val * 16 + d;
		}
		return val;
	}
	
	public static void main(String[] args) {
		String hex;
		int dec, i = 1, j;
		int[] oct = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any hexadecimal number: ");
		hex = sc.nextLine();
		
		dec = HexToDec(hex);
		
		while (dec != 0) {
			oct[i++] = dec % 8;
			dec = dec / 8;
		}
		
		System.out.print("Equivalent of octal number is ");
		for (j = i - 1; j > 0; j--) {
			System.out.print(oct[j]);
		}
	}
}
