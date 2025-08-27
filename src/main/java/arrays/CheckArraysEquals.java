package arrays;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 5, 7 };
		int arr2[] = { 6, 4, 5, 7 };

		// Approach 1
		boolean status = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
					break;
				}
			}
		}

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		System.out.println("--------------------------");

		// Approach 2
		boolean status2 = Arrays.equals(arr1, arr2);

		if (status2 == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

}
