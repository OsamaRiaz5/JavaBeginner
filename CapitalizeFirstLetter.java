/*
 * Program that input a sentence and capitalize first letter all words.
 */

import java.util.*;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the string: ");
		String line = sc.nextLine();
		String lineToUpper = "";
		Scanner scU = new Scanner(line);
		while (scU.hasNext()) {
			String word = scU.next();
			lineToUpper += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(lineToUpper.trim());
	}

}
