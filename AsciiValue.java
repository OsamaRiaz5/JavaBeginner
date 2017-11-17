/*
 * Program to print ascii value of a given character 
 */

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input character: ");
		char str = sc.nextLine().charAt(0);
		int chr = (int) str;
		System.out.println("The ASCII value of " + chr);
	}
	

}
