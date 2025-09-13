package conversion;

import java.util.*;

public class ConvertMapToArr {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "space");
        map.put(1, "nisar");
        map.put(3, "ahmed");

        Map.Entry<Integer, String>[] mapArr = map.entrySet().toArray(Map.Entry[]::new);
        System.out.println(Arrays.toString(mapArr));

    }
}
