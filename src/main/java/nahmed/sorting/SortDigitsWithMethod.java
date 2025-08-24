package nahmed.sorting;

import java.util.Arrays;

public class SortDigitsWithMethod {

	public static void main(String[] args) {
		int num = 15628469;

		// Convert the number to a string to make it easier to work with individual
		// digits
		String numString = Integer.toString(num);

		// Convert the string to a character array
		char[] digits = numString.toCharArray();

		// Sort the array of digits
		Arrays.sort(digits);

		// Reconstruct the sorted number from the sorted array of digits
		String sortedNumString = new String(digits);
		int sortedNum = Integer.parseInt(sortedNumString);

		System.out.println("Original number: " + num);
		System.out.println("Sorted number: " + sortedNum);

	}

}
