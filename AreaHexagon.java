/*
 * Program co compute the area of a hexagon
 */

import java.util.Scanner;

public class AreaHexagon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the length of a side of the hexagon: ");
		double s = sc.nextDouble();
		System.out.print("The area of the hexagon is: " + hexagonArea(s));
	}
	
	public static double hexagonArea(double s) {
		return (6 * (s * s)) / (Math.tan(Math.PI / 6));
	}

}
