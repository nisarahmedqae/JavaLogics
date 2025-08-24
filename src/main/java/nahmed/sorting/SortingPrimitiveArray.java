package nahmed.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortingPrimitiveArray {

    public static void main(String[] args) {
        int[] primitiveArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        // Convert primitive int array to Integer array using autoboxing
        // Then Sort thr int Array
        Integer[] sortedNonPrimitiveArr = Arrays.stream(primitiveArr).boxed().sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(sortedNonPrimitiveArr));

    }

}
