package maths;

public class Fibonacci {

	public static void main(String[] args) {
		// print Fibonacci series by printing variables
		int a = 0;
		int b = 1;
		int sum = 0;

		int num = 200; // Fibonacci series till this number

		for (int i = 0; i <= num; i++) {
			sum = a + b;
			if (sum > num) {
				break;
			}
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

}
