/*
 * Program to take three character from a given string and add last three characters 
 * at both front and back of the string. String length must be greater than three and more.
 */

import java.util.*;

public class ThreeCharFrontBackString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the string: ");
		String str = sc.nextLine();

		System.out.println(str.substring((str.length() - 3), str.length()) + str + str.substring((str.length() - 3), str.length()));
	}

}
