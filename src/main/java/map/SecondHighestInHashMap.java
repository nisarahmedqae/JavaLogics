package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SecondHighestInHashMap {

	public static void main(String[] args) {
		/// Sample HashMap with integer values
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("A", 30);
		hashmap.put("B", 10);
		hashmap.put("C", 70);
		hashmap.put("D", 50);
		hashmap.put("E", 40);

		// Convert the values to a list
		List<Integer> valuesList = new ArrayList<>(hashmap.values());
		Collections.sort(valuesList, Comparator.reverseOrder());

		System.out.println(valuesList);
		System.out.println(valuesList.get(1));

	}

}
