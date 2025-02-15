package nahmed.integer;

public class PalindromeChecker {

	public static void main(String[] args) {
		int input = 123;
		char[] digitsArr = String.valueOf(input).toCharArray();

		for (int i = digitsArr.length - 1; i >= 0; i--) {
			System.out.println("Input: " + input);
			int reversed = reverseNumber(input);
			System.out.println("Reversed: " + reversed);
			if (input == reversed) {
				System.out.println("Palindrome found: " + input);
				break;
			}
			int digit = digitsArr[i] - '0'; // converting char to int
			input = input * 10 + digit;
		}
		System.out.println("Final Input: " + input);
		System.out.println("Final Palindrome: " + input);
	}

	public static int reverseNumber(int input) {
		char[] digitsArr = String.valueOf(input).toCharArray();
		int reversedResult = 0;

		for (int i = digitsArr.length - 1; i >= 0; i--) {
			int digit = digitsArr[i] - '0'; // converting char to int
			reversedResult = reversedResult * 10 + digit;
		}

		return reversedResult;
	}
}
