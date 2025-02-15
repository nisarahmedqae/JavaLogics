package sdet;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 16461;
		int oriNum = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		if (oriNum == rev) {
			System.out.println(oriNum + " Palindrome number");
		} else {
			System.out.println(oriNum + " not a Palindrome number");
		}
	}

}
