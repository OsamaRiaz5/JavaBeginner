/*
 * Program to print the area and perimeter of a rectangle
 */

import java.util.Scanner;

public class AreaAndPerimeterRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input width: ");
		double width = sc.nextDouble();
		System.out.println("Input height: ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double perimeter = 2 * (width + height); 
		
		System.out.printf("Area is %.2f * %.2f = %.2f\n", width, height, area);
	}

}
