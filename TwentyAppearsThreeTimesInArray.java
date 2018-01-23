/*
 * Program to check if the value 20 appears three times and no 20's are next to each other in an array of integers
 */

import java.util.*;

public class TwentyAppearsThreeTimesInArray {

	public static void main(String[] args) {
		int len = 0;
		int count = 0;
		boolean value = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length of an array: ");
		len = sc.nextInt();
		
		//create array
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Input element: ");
			array[i] = sc.nextInt();
		}
		
		//count 20's
		for (int i = 0; i < len; i++) {
			if (array[i] == 20) {
				count++;
			}
		}
		if (count == 3) {
			System.out.println("Number 20 is 3 times in array");
		} else {
			System.out.println("Number 20 is not 3 times in array. Number 20 is " + count + " times in array");
		}
		
		//20's next to each other
		for (int i = 0; i < len - 1; i++) {
			if (array[i] == 20 && array[i + 1] == 20) {
				value = true;
			}
		}
		if (value == true) {
			System.out.println("Number 20's are next to each other in an array");
		} else {
			System.out.println("Number 20's are not next to each other in an array");
		}
		

		
		
		
		
		
		
		
	}
}
