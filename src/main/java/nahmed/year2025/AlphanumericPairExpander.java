package nahmed.year2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlphanumericPairExpander {

    public static void main(String[] args) {
        String str = "a1b2c3d0f1e1";
        char[] arr = str.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            char key = arr[i];
            int value = arr[i + 1] - '0';
            i++;
            map.put(key, value);
        }
        System.out.println(map);

        String blank = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                blank = blank + entry.getKey();
            }
        }
        System.out.println(blank);
    }
}

