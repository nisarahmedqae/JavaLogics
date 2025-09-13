package sorting;

import java.util.*;

public class SortMapKeys {

    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "middle");
        map.put(1, "nisar");
        map.put(3, "ahmed");

        // Convert Map to Array
        Map.Entry<Integer, String>[] mapArr = map.entrySet().toArray(Map.Entry[]::new);
        System.out.println(Arrays.toString(mapArr)); //[1=nisar, 2=middle, 3=ahmed]

        // Sort by keys in Descending Order
        Arrays.sort(mapArr, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println(Arrays.toString(mapArr)); //[3=ahmed, 2=middle, 1=nisar]

        // Store sorted Array into LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (var ele : mapArr) {
            linkedHashMap.put(ele.getKey(), ele.getValue());
        }
        System.out.println(linkedHashMap); //{3=ahmed, 2=middle, 1=nisar}
    }
}
