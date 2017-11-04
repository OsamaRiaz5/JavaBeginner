/*
 * Program that takes two number as input and display the product of two numbers
 */

import java.util.Scanner;

public class InputAndMultiplication {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

}
