import java.util.Scanner;

/*
 * Program to convert string into lowercase
 */
public class StringLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String line = sc.nextLine();
		line = line.toLowerCase();
		System.out.println(line);
	}

}
