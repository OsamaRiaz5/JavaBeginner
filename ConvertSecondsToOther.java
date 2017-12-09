/*
 * Program to convert seconds to hours, minutes and 
 */

import java.util.*;

public class ConvertSecondsToOther {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input seconds: ");
		int seconds = sc.nextInt();
		int sec = seconds % 60;
		int h = seconds / 3600;
		int min = (seconds % 3600) / 60; 
		System.out.println(h + ":" + min + ":" + sec);
	}

}
