/*
 * Program to extract the first half of a string of even length.
 */

import java.util.*;

public class HalfString {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String str = sc.nextLine();
		System.out.println(str.substring(0, str.length() / 2));
	}

}
