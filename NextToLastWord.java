/*
 * Program to find penultimate (next to last) word of a sentence.
 */

import java.util.*;

public class NextToLastWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String line = sc.nextLine();
		String[] words = line.split(" ");
		System.out.println("Penultimate word: " + words[words.length - 2]);
	}

}
