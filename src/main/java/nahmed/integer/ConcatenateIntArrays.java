package nahmed.integer;

import java.util.Arrays;

public class ConcatenateIntArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };

		int arrLength = arr1.length + arr2.length;
		int[] concatenatedIntArray = new int[arrLength];

		int index = 0;
		for (int element : arr1) {
			concatenatedIntArray[index++] = element;
		}

		for (int element : arr2) {
			concatenatedIntArray[index++] = element;
		}

		System.out.println(Arrays.toString(concatenatedIntArray));

	}

}
