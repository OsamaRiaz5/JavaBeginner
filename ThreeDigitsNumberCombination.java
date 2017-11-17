/*
 * Program to create three-digit unique number combination using 1,2,3,4. Count how many
 * numbers are there 
 */
public class ThreeDigitsNumberCombination {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (i != j & j != k & k != i) {
						System.out.println(i + "" + j + "" + k);
						counter++;
					}
				}
			}
		}
		System.out.println("\nTotal number of three-digit-number is " + counter);
	}

}
