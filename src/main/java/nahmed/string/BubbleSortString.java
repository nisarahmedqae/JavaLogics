package nahmed.string;

import java.util.Arrays;

public class BubbleSortString {
	
	public static void main(String[] args) {
		
		String[] arr = { "banana", "apple", "grape", "orange", "pineapple" };

		System.out.println("Arrays before sorting: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Arrays after sorting: " + Arrays.toString(arr));
	}
}
