/*
 * Program to count letters, spaces, digits and other. 
 */

import java.util.Scanner;

public class CountChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = sc.nextLine();
		count(str);
	}
	
	public static void count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;
		int digit = 0;
		int space = 0;
		int other = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}
			else if (Character.isDigit(ch[i])) {
				digit++;
			}
			else if (Character.isSpaceChar(ch[i])) {
				space++;
			} 
			else {
				other++;
			}
		}
		System.out.println("The string: ");
		System.out.println("Letters: " + letter);
		System.out.println("Digits: " + digit);
		System.out.println("Spaces: " + space);
		System.out.println("Other: " + other);
	}

}
