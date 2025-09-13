package sorting;

import java.util.*;

public class SortMapValues {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("middle", 2);
        map.put("nisar", 1);
        map.put("ahmed", 3);

        // Convert Map to Array
        Map.Entry<String, Integer>[] mapArr = map.entrySet().toArray(Map.Entry[]::new);
        System.out.println(Arrays.toString(mapArr)); //[[ahmed=3, middle=2, nisar=1]

        // Sort by values in Descending Order
        Arrays.sort(mapArr, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(Arrays.toString(mapArr)); //[ahmed=3, middle=2, nisar=1]

        // Store sorted Array into LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (var ele : mapArr) {
            linkedHashMap.put(ele.getKey(), ele.getValue());
        }
        System.out.println(linkedHashMap); //{ahmed=3, middle=2, nisar=1}
    }
}
