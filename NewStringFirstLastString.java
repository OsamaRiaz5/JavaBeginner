
/*
 * Program to create a new string taking first and last characters from two given string. If the length of either string is 0 use "#" as a missing character.
 */

import java.util.*;

public class NewStringFirstLastString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first string: ");
		String str1 = sc.nextLine();
		System.out.println("Input second string: ");
		String str2 = sc.nextLine();
		
		int length2 = str2.length();
		String result = "";
		result += (str1.length() >= 1) ? str1.charAt(0) : "#";
		result += (length2 >= 1) ? str2.charAt(length2 - 1) : "#";
		
		System.out.println(result);
	}

}
