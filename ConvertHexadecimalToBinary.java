/*
 * Program to convert hexadecimal number to binary number
 */

import java.util.Scanner;

public class ConvertHexadecimalToBinary {
	public static int HexToDec(String s) {
		String digits = "01234567889ABCDEF";
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
		int[] bin = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any hexadecimal number: ");
		hex = sc.nextLine();
		
		/*convert hex to dec*/
		dec = HexToDec(hex);
		
		/*convert dec to bin*/
		while (dec != 0) {
			bin[i++] = dec % 2;
			dec = dec / 2;
		}
		
		System.out.print("Equivalent binary number is: ");
		for (j = i -1; j > 0; j--) {
			System.out.print(bin[j]);
		}
	}

}
