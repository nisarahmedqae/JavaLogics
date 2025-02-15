package sdet;

public class FactorialNumber {

	public static void main(String[] args) {
		// 5!= 1*2*3*4*5 = 120

		int num = 5;
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial + "");
	}

}
