package filtering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilteringStringFromArray {

    public static void main(String[] args) {

        String[] arr = {"nisar", "riyaz", "nisar", "kayenat", "riyaz", "nisar", "fatma"};

        Map<String, Integer> hashMap = new HashMap<>();
        List<String> duplicateList = new ArrayList<>();
        List<String> nonRepeatingList = new ArrayList<>();
        List<String> uniqueList = new ArrayList<>();

        // Count occurrences of each element
        for (String element : arr) {
            hashMap.merge(element, 1, Integer::sum);
        }

        // Categorize elements based on occurrence count
        for (String element : hashMap.keySet()) {
            int count = hashMap.get(element);

            if (count == 1) {
                nonRepeatingList.add(element);
            } else if (count > 1) {
                duplicateList.add(element);
            }
            uniqueList.add(element);
        }

        System.out.println("hashMap Pairs: " + hashMap);
        System.out.println("Duplicate List: " + duplicateList);
        System.out.println("Non-Repeating List: " + nonRepeatingList);
        System.out.println("Unique List: " + uniqueList);

    }
}
