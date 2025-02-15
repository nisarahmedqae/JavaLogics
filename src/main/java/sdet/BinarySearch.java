package sdet;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 7, 8, 10 }; // should be in sorted order
		boolean status = false;

		int key = 7;

		int lowerIndex = 0; // 0th position
		int higherIndex = arr.length - 1; // last position

		while (lowerIndex <= higherIndex) {
			int middleIndex = (lowerIndex + higherIndex) / 2; // mid position
			if (key == arr[middleIndex]) {
				System.out.println("Element Found");
				status = true;
				break;
			}

			if (key > arr[middleIndex]) { // key greater than mid
				lowerIndex = middleIndex + 1; // l moving right side
			}

			if (key < arr[middleIndex]) { // key less than mid
				higherIndex = middleIndex - 1; // l moving left side
			}
		}
		if (status == false) {
			System.out.println("Element not found");
		}

		// Approach2
		int index = Arrays.binarySearch(arr, key);
		System.out.println(index); // it will display value at 8th position
	}

}
