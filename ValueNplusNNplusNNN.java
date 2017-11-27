/*
 * Program that input an integer and compute the value n + nn + nnn
 */

import java.util.Scanner;

public class ValueNplusNNplusNNN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt();
		
		System.out.printf("%d + %d%d + %d%d%d = ", n, n, n, n, n, n);
		System.out.println(n + 11 * n + 111 * n);
	}

}