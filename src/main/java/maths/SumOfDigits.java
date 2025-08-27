package maths;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;

		for (int ele : String.valueOf(num).toCharArray()) {
			int digit = ele - '0';
			sum = sum + digit;
		}

		System.out.println(sum);

	}
}