package nahmed.integer;

import java.util.ArrayList;
import java.util.HashMap;

public class FilteringIntFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9 };

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		ArrayList<Integer> duplicateList = new ArrayList<>();
		ArrayList<Integer> nonRepeatingList = new ArrayList<>();
		ArrayList<Integer> uniqueList = new ArrayList<>();

		// Count occurrences of each element
		for (int element : arr) {
			if (hashMap.get(element) == null) {
				hashMap.put(element, 1);
			} else {
				hashMap.put(element, hashMap.get(element) + 1);
			}
		}

		// Categorize elements based on occurrence count
		for (int element : hashMap.keySet()) {
			int count = hashMap.get(element);

			if (count == 1) {
				nonRepeatingList.add(element);
			} else if (count > 1) {
				duplicateList.add(element);
			}
			uniqueList.add(element);
		}

		System.out.println("hashMap Pairs: " + hashMap);
		System.out.println("Duplicate List: " + duplicateList);
		System.out.println("Non-Repeating List: " + nonRepeatingList);
		System.out.println("Unique List: " + uniqueList);
		
	}
}
