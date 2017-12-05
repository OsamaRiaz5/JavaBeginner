/*
 * Program that accept a number and check that number is even or not
 */

import java.util.Scanner;

public class EvenOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an counting number: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The number " + num + " is even.");
		} else {
			System.out.println("The number " + num + " is odd.");
		}
	}
}
