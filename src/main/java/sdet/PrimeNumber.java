package sdet;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number= Divisible by 1 and itself
		// For example, the first few prime numbers are 2, 3, 5, 7, 11, 13, and so on.
		// These numbers are only divisible by 1 and themselves.

		int num = 3;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}

		}

		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Non Prime Number");
		}
	}

}
