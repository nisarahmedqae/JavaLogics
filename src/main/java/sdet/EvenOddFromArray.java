package sdet;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even Numbers in Array:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers in Array:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
