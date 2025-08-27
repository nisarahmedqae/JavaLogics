package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBasedArrayRotator {

    public static void main(String[] args) {
        //Input = {1,2,3,4,5,6,7,8}, key = 4,  Output = {5,6,7,8,1,2,3,4}

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 4;

        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(key, new ArrayList<>());

        for (int ele : arr) {
            if (ele > key) {
                map.get(key).add(ele);
            }
        }

        for (int ele : arr) {
            if (ele <= key) {
                map.get(key).add(ele);
            }
        }

        System.out.println(map.get(key));
    }
}
