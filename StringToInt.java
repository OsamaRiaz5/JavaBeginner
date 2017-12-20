/*
 * Program to convert string to integer.
 */

import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number(string): ");
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		System.out.printf("The integer value is %d", num);
	}

}
