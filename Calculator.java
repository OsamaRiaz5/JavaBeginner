/*
 * Simple calculator
 */

import java.util.*;

public class Calculator {
	
	public static void main(String[] args) {
		double n1, n2;
		String operation;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		n1 = sc.nextDouble();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Input operation: ");
		operation = op.next();		
		
		System.out.println("Input second number: ");
		n2 = sc.nextDouble();
		
		switch (operation) {
		case "+":
			System.out.println("Your answer is: " + (n1 + n2));
			break;
		case "-":
			System.out.println("Your answer is: " + (n1 - n2));
			break;
		case "*":
			System.out.println("Your answer is: " + (n1 * n2));
			break;
		case "/":
			System.out.println("Your answer is: " + (n1 / n2));
			break;
		default:
			System.out.println("Something is wrong!");
		}
	}
}