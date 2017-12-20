/*
 * Program that insert word in the middle of the another string.
 */
public class InsertWordInWord {
	public static void main(String[] args) {
		String str = "Python 3.0";
		String word = "Tutorial";
		System.out.println(str.substring(0, 7) + word + str.substring(6));
	}

}
