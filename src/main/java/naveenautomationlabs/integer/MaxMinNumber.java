package naveenautomationlabs.integer;

public class MaxMinNumber {

	// find out the max and min number from the given three int positive numbers

	public static void findMaxNumber(int a, int b, int c) {
		int max = 0;
		while (a > 0 || b > 0 || c > 0) {
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println("Max number: " + max);
	}

	public static void findMinNumber(int a, int b, int c) {
		int min = 0;
		while (a > 0 && b > 0 && c > 0) {
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println("Min number: " + min);
	}

	public static void main(String[] args) {
		findMaxNumber(10, 20, 30);
		findMinNumber(10, 20, 30);

	}

}
