/*
 * Program to create a new string of 4 copies of the last 3 characters of the original
 * string. The length of the original string must be 3 and above
 */

import java.util.*;

public class CopyLast3Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String str = sc.nextLine();
		String lastThree = str.substring(str.length() - 3);
		System.out.println(lastThree + lastThree + lastThree + lastThree);
	}

}
