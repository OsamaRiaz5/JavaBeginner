import java.util.Scanner;

/*
 * Program that accepts two integer values from the user and return the larger value.
 * However, if the two values are the same, return 0 and return the smaller value if 
 * the two values have the same remainder when divided by 6.
 */

public class LargerValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int x = sc.nextInt();
		System.out.println("Input second integer: ");
		int y = sc.nextInt();
		System.out.println("Result: " + compare(x, y));
	}
	
	public static int compare(int a, int b) {
		if (a == b) {
			return 0;
		}
		
		if ((a % 6) == (b % 6)) {
			return (a < b) ? a : b;	
		}

		return (a > b) ? a : b;
	}

}
