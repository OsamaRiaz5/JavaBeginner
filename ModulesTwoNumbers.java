import java.util.Scanner;

/*
 * Program to calculate the modules of two numbers without using any inbuilt 
 * modulus operation.
 */
public class ModulesTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int a = sc.nextInt();
		System.out.println("Input second integer: ");
		int b = sc.nextInt();
		int div = a / b;
		int result = a - (div * b);
		System.out.println(a + " % " + b + " = " + result);
	}

}
