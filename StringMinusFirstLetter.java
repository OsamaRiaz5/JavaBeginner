/*
 * Program to create concatenation (powi¹zanie) of the two strings excepts removing the first character of each string.
 */

import java.util.*;

public class StringMinusFirstLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first string: ");
		String str1 = sc.nextLine();
		System.out.println("Input second string: ");
		String str2 = sc.nextLine();
		System.out.println(str1.substring(1) + str2.substring(1));
	}

}
