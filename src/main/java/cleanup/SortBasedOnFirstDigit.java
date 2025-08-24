package cleanup;

import java.util.Arrays;

public class SortBasedOnFirstDigit {

	public static void main(String[] args) {
		// Input array
		int[] input = { 3, 45, 2, 85, 84, 9, 777 };

		// Convert int array to Integer array for custom sorting
		Integer[] inputArray = Arrays.stream(input).boxed().toArray(Integer[]::new);

		// Sort the array based on custom comparator
		Arrays.sort(inputArray, (a, b) -> {
			// Get the first digit of each number
			int firstDigitA = (a >= 10) ? Integer.parseInt(Integer.toString(a).substring(0, 1)) : a;
			int firstDigitB = (b >= 10) ? Integer.parseInt(Integer.toString(b).substring(0, 1)) : b;

			// Compare first digits in descending order; if equal, compare the whole number
			if (firstDigitA == firstDigitB) {
				return b - a;
			}
			return firstDigitB - firstDigitA;
		});

		// Concatenate the sorted numbers into a single string
		StringBuilder result = new StringBuilder();
		for (int num : inputArray) {
			result.append(num);
		}

		// Print the concatenated result
		System.out.println("Output: " + result);
	}
}