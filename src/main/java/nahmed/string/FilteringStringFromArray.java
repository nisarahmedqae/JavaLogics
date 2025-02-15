package nahmed.string;

import java.util.ArrayList;
import java.util.HashMap;

public class FilteringStringFromArray {

	public static void main(String[] args) {

		String[] arr = { "nisar", "riyaz", "nisar", "kayenat", "riyaz", "nisar", "fatma" };

		HashMap<String, Integer> hashMap = new HashMap<>();
		ArrayList<String> duplicateList = new ArrayList<>();
		ArrayList<String> nonRepeatingList = new ArrayList<>();
		ArrayList<String> uniqueList = new ArrayList<>();

		// Count occurrences of each element
		for (String element : arr) {
			if (hashMap.get(element) == null) {
				hashMap.put(element, 1);
			} else {
				hashMap.put(element, hashMap.get(element) + 1);
			}
		}

		// Categorize elements based on occurrence count
		for (String element : hashMap.keySet()) {
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
