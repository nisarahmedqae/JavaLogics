package arrays;

import java.util.Arrays;

public class SeparatePositiveNegativeArrays {

	public static void main(String[] args) {

		int[] originalArray = { 4, -2, 9, -7, 0, 5, -1 };

		int positiveArrLength = 0;
		int negativeArrLength = 0;

		for (int value : originalArray) {
			if (value >= 0) {
				positiveArrLength++;
			} else if (value < 0) {
				negativeArrLength++;
			}
		}

		int[] positiveArray = new int[positiveArrLength];
		int[] negativeArray = new int[negativeArrLength];

		int positiveIndex = 0;
		int negativeIndex = 0;

		for (int value : originalArray) {
			if (value >= 0) {
				positiveArray[positiveIndex++] = value;
			} else if (value < 0) {
				negativeArray[negativeIndex++] = value;
			}
		}

		System.out.println("Positive Array: " + Arrays.toString(positiveArray));
		System.out.println("Negative Array: " + Arrays.toString(negativeArray));
	}

}
