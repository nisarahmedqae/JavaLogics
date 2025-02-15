package sdet;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int[] arr = { 50, 30, 40, 20, 60, 10, 80 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max number in Array is: " + max);
		System.out.println("Max number in Array is: " + min);
	}

}
