package sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKeysWithStream {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 5);
        hashMap.put("apple", 2);
        hashMap.put("grape", 7);
        hashMap.put("orange", 3);
        hashMap.put("pineapple", 6);

        System.out.println("HashMap before sorting: " + hashMap);

        // Sort by keys in Ascending Order
        LinkedHashMap<String, Integer> sortedByKeysAsc = hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        System.out.println("Sorted by Keys (Ascending): " + sortedByKeysAsc);

    }
}
