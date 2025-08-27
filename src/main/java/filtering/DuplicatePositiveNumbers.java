package filtering;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class DuplicatePositiveNumbers {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 2}; //2
        int[] arr2 = {-1, -2, -3, -4, -5, 4}; //4

        int[] resultArr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : resultArr) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        for (var entry : map.entrySet()) {
            int count = entry.getValue();
            if (entry.getKey() >= 0 && count > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
