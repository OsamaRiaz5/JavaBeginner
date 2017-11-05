/*
 * Program to convert decimal to hexadecimal number
 */

import java.util.Scanner;

public class ConvertDecimalToHexadecimal {
	public static void main(String[] args) {
		
		int dec, rem;
		String hexNum = "";
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Input decimal number: ");
		
		dec = sc.nextInt();
		
		while (dec > 0) {
			rem = dec % 16;
			hexNum = hex[rem] + hexNum;
			dec = dec / 16;
		}
		System.out.println("Hexadecimal number is: " + hexNum);
		
	}

}
