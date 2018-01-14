/*
 * Check if a string start with specific word.
 */

import java.util.*;

public class StartWithString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input specific word: ");
		String word = sc.nextLine();
		System.out.println("Input string: ");
		String str = sc.nextLine();
		
		System.out.println(str.startsWith(word));
	}

}
