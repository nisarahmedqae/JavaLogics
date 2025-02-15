package nahmed.year2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupTheAnagrams {

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, List<String>> map = new HashMap<>();

		for (String word : words) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String str = new String(charArray);

			map.putIfAbsent(str, new ArrayList<>());
			/*
			 * if(map.get(str)==null) { 
			 * map.put(str, new ArrayList<>()); 
			 * }
			 */
			map.get(str).add(word);

		}
		System.out.println(map);
		System.out.println(map.values());

	}

}
