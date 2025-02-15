package nahmed.integer;

import java.util.Arrays;

public class ShiftZeroesToRight {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 0, 3, 0, 4, 5, 0 };
		int[] result = new int[arr.length];
		int index = 0;

		// Starting from 0th index so filling elements first
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[index++] = arr[i];
			}
		}

		// Fill the remaining elements with zeros
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result[index++] = 0;
			}
		}

		System.out.println(Arrays.toString(result));

	}
}
