/*
 * Program to create new string taking first 3 characters from a given string. If the length of the given string is less than 3, use # as a substitute characters.
 */

import java.util.*;

public class NewStringFromOld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = sc.nextLine();
		int len = str.length();
		
		if (len >= 3) {
			System.out.println(str.substring(0, 3));
		} else if (len == 2) {
			System.out.println(str.substring(0, 2) + "#");
		} else if (len == 1) {
			System.out.println(str.substring(0, 1) + "##");
		} else {
			System.out.println("###");
		}
		
	}
}
