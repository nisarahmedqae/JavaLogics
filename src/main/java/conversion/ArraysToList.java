package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToList {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println(intList);

        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);
        System.out.println(arrayList);

    }
}
