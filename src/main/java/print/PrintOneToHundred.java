package print;

public class PrintOneToHundred {

	public static void main(String[] args) {
		/*
		 * output numbers from 1...100 without using any numbers in your code
		 */

		int one = 'A' / 'A';
		String str = "..........";
		int len = str.length() * str.length();

		for (int i = one; i <= len; i++) {
			System.out.println(i);
		}

		System.out.println("--------------------------");

		/*
		 * a = 97; b = 98; c = 99; d = 100;
		 */
		for (int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
	}

}
