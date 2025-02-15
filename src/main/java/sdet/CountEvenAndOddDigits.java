package sdet;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 12345;
		int evenCount = 0;
		int oddCount = 0;

		while (num > 0) { // 1234 123 12 1
			int lastDigit = num % 10; // 4 3 2 1
			if (lastDigit % 2 == 0) {
				evenCount++; // 1 2
			} else {
				oddCount++; // 1 2
			}
			num = num / 10; // 123 12 1
		}
		System.out.println("Even Numbers: " + evenCount);
		System.out.println("Odd Numbers: " + oddCount);
	}

}
