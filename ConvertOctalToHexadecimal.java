/*
 * Program to convert octal number to hexadecimal number
 */

import java.util.Scanner;

public class ConvertOctalToHexadecimal {
	public static void main(String[] args) {
		String oct, hex;
		int dec;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any octal number: ");
		oct = sc.nextLine();
		dec = Integer.parseInt(oct, 8);
		hex = Integer.toHexString(dec);
		System.out.println("Equivalent hexadecimal number is " + hex);
	}

}
