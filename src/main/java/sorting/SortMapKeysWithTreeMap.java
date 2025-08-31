package sorting;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapKeysWithTreeMap {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 5);
        hashMap.put("apple", 2);
        hashMap.put("grape", 7);
        hashMap.put("orange", 3);
        hashMap.put("pineapple", 6);

        System.out.println("HashMap before sorting: " + hashMap);

        // Sort using TreeMap in Descending Order
        Map<String, Integer> sortedByKeysAsc = new TreeMap<>(Comparator.reverseOrder());
        sortedByKeysAsc.putAll(hashMap);

        System.out.println("Sorted by Keys (Descending): " + sortedByKeysAsc);

    }
}
