package nahmed.integer;

import java.util.ArrayList;

public class FilteringIntFromArrayWithoutMap {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 5, 5, 4, 6, 6, 0, 4, 9 };
		ArrayList<Integer> nonRepeatingList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				nonRepeatingList.add(arr[i]);
			}
		}
		System.out.println("Non Repeating numbers are: " + nonRepeatingList);

	}
}
