/*
 * Program to create a string in the form longString + shortString + longString
 */

import java.util.*;

public class StringLongShortLong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first string: ");
		String str1 = sc.nextLine();
		System.out.println("Input second string: ");
		String str2 = sc.nextLine();
		
		if (str1.length() >= str2.length()) {
			System.out.println(str1 + str2 + str1);
		} else {
			System.out.println(str2 + str1 + str2);
		}
	}

}
