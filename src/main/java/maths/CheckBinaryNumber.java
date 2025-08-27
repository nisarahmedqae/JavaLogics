package maths;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		// check the given number is binary or not
		isBinaryNumber(1011);
		isBinaryNumber(23405);
		isBin(1011);
	}

	// Approach 1
	private static void isBin(int number) {
		if (String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " not a binary number");
		}
	}

	// Approach 2
	private static void isBinaryNumber(int number) {
		boolean status = true;
		int copyNum = number;

		while (copyNum != 0) {
			int lastDigit = copyNum % 10; // 1011%10->1
			if (lastDigit > 1) {
				status = false;
				break;
			}
			copyNum = copyNum / 10;
		}
		if (status) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " not a binary number");
		}
	}
}
