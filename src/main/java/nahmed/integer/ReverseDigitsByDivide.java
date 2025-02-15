package nahmed.integer;

public class ReverseDigitsByDivide {

	public static void main(String[] args) {

		int digits = 123456789;
		int reverse = 0;

		while (digits != 0) {
			int lastDigit = digits % 10;
			reverse = reverse * 10 + lastDigit;

			digits = digits / 10;
		}
		System.out.println(reverse);

	}

}
