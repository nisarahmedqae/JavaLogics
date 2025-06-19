package nahmed.string;

import java.util.*;

public class BubbleSortHashMapKeys {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 5);
        hashMap.put("apple", 2);
        hashMap.put("grape", 7);
        hashMap.put("orange", 3);
        hashMap.put("pineapple", 6);

        System.out.println("HashMap before sorting: " + hashMap);

        // Convert the HashMap into an array
        Map.Entry<String, Integer>[] mapArr = new Map.Entry[hashMap.size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            mapArr[index++] = entry;
        }

        // Perform bubble sort on the mapArr based on keys
        for (int i = 0; i < mapArr.length; i++) {
            for (int j = i + 1; j < mapArr.length; j++) {
                if (mapArr[i].getKey().compareTo(mapArr[j].getKey()) > 0) {
                    // Swap mapArr
                    Map.Entry<String, Integer> temp = mapArr[i];
                    mapArr[i] = mapArr[j];
                    mapArr[j] = temp;
                }
            }
        }

        // Create a new LinkedHashMap to store the sorted mapArr in order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Put the sorted mapArr into the LinkedHashMap
        for (Map.Entry<String, Integer> entry : mapArr) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap after sorting by keys: " + linkedHashMap);
    }
}