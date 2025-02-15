package nahmed.string;

import java.util.HashMap;

public class CharFrequencyCounter {

	public static void main(String[] args) {

		String input = "aabbcccdd"; // Output = a2b2c3d2
		char[] charArr = input.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for (char ele : charArr) {
			if (hashmap.get(ele) == null) {
				hashmap.put(ele, 1);
			} else {
				hashmap.put(ele, hashmap.get(ele) + 1);
			}
		}
		System.out.println(hashmap);

		String result = "";
		for (char ele : hashmap.keySet()) {
			result = result + ele + hashmap.get(ele);
		}
		System.out.println(result);

	}

}
