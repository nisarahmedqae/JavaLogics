package sdet;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "Welcome To Java"; // original string
		String[] splittedStr = str.split(" "); // splitting string into words
		String blank = ""; // Reset reverse for each word

		for (String word : splittedStr) { // welcome

			for (int i = word.length() - 1; i >= 0; i--) {
				blank = blank + word.charAt(i);
			}
			blank = blank + " ";
		}

		System.out.println(blank); // Move to the next line after printing all reversed words
	}
}