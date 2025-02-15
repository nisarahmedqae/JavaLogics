package nahmed.year2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ThirdLargestUniqueNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 3, 4, 8 };
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int ele : arr) {
			// Increment count if the element exists, else initialize with 1
			hashmap.put(ele, hashmap.getOrDefault(ele, 0) + 1);
		}
		System.out.println(hashmap);

		for (int ele : hashmap.keySet()) {
			if (hashmap.get(ele) == 1) {
				list.add(ele);
			}
		}

		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.get(2)); // Third Highest Number according to Index
	}

}
