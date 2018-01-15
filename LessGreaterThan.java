/*
 * Program to check if the number is in the range <90;95>.
 */

import java.util.*;


public class LessGreaterThan {
	public static void main(String[] args) {
		int n1 = 90;
		int n2 = 95;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int x = sc.nextInt();

		
		if ((x >= n1) && (x <= n2)) {
			System.out.println(x + " is in the range <" + n1 + ";" + n2 + ">");
		} else {
			System.out.println(x + " doesn't fit in the range <" + n1 + "; " + n2 + ">");
		}
	}
}
