import java.util.Scanner;

/*
 * Program to multiply two binary numbers
 */

public class MultiplyTwoBinaryNumbers {
	public static void main(String[] args) {
		long binary1, binary2, multiply = 0;
		int digit, factor = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first binary number: ");
		binary1 = sc.nextLong();
		System.out.println("Input second binary number: ");
		binary2 = sc.nextLong();
		
		while (binary2 != 0) {
			digit = (int) (binary2 % 10);
			if (digit == 1) {
				binary1 = binary1 * factor;
				multiply = binaryproduct((int) binary1, (int) multiply);
			} else {
				binary1 = binary1 * factor;
			}
			binary2 = binary2 / 10;
			factor = 10;
		}
		System.out.println("Product of two binary numbers: " + multiply);
		
	}
	
	static int binaryproduct(int binary1, int binary2) {
		int i = 0;
		int remainder = 0;
		int[] sum = new int[20];
		int binary_prod_result = 0;
		
		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
			remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		
		--i;
		while  (i >= 0) {
			binary_prod_result = binary_prod_result * 10 + sum[i--];
		}
		
		return binary_prod_result;
	}

}
