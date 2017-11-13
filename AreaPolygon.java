/*
 * Program to compute the area of the polygon
 */

import java.util.Scanner;

public class AreaPolygon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of the sides of the polygon: ");
		int n = sc.nextInt();
		System.out.print("Input the lenght of one of the sides: ");
		double s = sc.nextDouble();
		
		System.out.print("The area of the polygon is: " + polygonArea(n, s));
	}
	
	public static double polygonArea(int n, double s) {
		return (n * (s * s)) / (4 * Math.tan(Math.PI / n));
	}

}
