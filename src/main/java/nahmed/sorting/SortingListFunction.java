package nahmed.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListFunction {

    public static void main(String[] args) {
        // Sample list
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);

        // Sort list in ascending order
        Collections.sort(list);
        System.out.println("Ascending order:");
        System.out.println(list);

        // Sort list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order:");
        System.out.println(list);

    }
}