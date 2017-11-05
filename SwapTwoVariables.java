import java.util.Scanner;

/*
 * Program to swap two variables
 */



public class SwapTwoVariables {
	public static void main(String[] args) {
		double temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		double a = sc.nextDouble();
		System.out.println("Input second number: ");
		double b = sc.nextDouble();
		
		System.out.println("Before swapping: a, b = " + a + ", " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: a, b = " + a + ", " + b);
		
		
	}

}
