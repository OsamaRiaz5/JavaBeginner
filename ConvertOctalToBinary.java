/*
 * Program to convert octal number to binary number
 */

import java.util.Scanner;

public class ConvertOctalToBinary {
	public static void main(String[] args) {
		int[] oct_num = {0,1,10,11,100,101,110,111};
		long oct, temp, bin, place;
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any octal number: ");
		oct = sc.nextLong();
		
		temp = oct;
		bin = 0;
		place = 1;
		
		while (temp != 0) {
			rem = (int) (temp % 10);
			bin = bin + oct_num[rem] * place;
			temp /= 10;
			place *= 1000;
		}
		System.out.println("Equivalent binary number: " + bin);
	}
}
