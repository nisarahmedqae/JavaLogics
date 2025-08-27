package counters;

import java.util.HashMap;

public class CharFrequencyCounter {

	public static void main(String[] args) {

		String input = "aabbcccdd"; // Output = a2b2c3d2
		char[] charArr = input.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for (char ele : charArr) {
			hashmap.merge(ele, 1, Integer::sum);
		}
		System.out.println(hashmap);

		String result = "";
		for (var entry : hashmap.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);

	}

}
