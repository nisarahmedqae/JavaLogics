package conversion;

import java.util.Arrays;
import java.util.List;

public class ListToArrays {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the List to a primitive int array using a stream
        int[] primitiveArr = list.stream()
                .mapToInt(i -> i) // Map each Integer object to an int primitive
                .toArray();
        System.out.println(Arrays.toString(primitiveArr));

        // Convert the List to an integer array
        Integer[] array = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

    }
}
