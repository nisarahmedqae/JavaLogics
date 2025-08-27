package sorting;

public class SortDigits {

	public static void main(String[] args) {
		long num = -32165498700L;
		long positiveNum = -num; // Convert to positive
		char[] charArr = String.valueOf(positiveNum).toCharArray();

		System.out.println("Num before sorting: " + Long.parseLong(new String(charArr)));

		// Implementing the bubble sort algorithm to sort the charArr array
		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {

				// Convert characters to integers for comparison
				int digit1 = charArr[i] - '0';
				int digit2 = charArr[j] - '0';

				// Swap if the current digit is greater than the next digit
				if (digit1 > digit2) {
					char temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}

		System.out.println("Num after sorting: " + Long.parseLong(new String(charArr)));

	}
}
