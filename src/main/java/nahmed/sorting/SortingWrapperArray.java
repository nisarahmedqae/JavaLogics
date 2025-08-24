package nahmed.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingWrapperArray {

    public static void main(String[] args) {

        // Sorting Integer Array
        Integer[] integerArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        Integer[] sortedIntegerArr = Arrays.stream(integerArr).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(sortedIntegerArr));

        // Sorting String Array
        String[] stringArr = {"Realme", "Vivo", "Apple", "Samsung", "Xiaomi", "Oppo"};

        String[] sortedStringArr = Arrays.stream(stringArr).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println(Arrays.toString(sortedStringArr));

    }

}
