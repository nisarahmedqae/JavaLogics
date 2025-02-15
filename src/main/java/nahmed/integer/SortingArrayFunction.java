package nahmed.integer;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayFunction {

	public static void main(String[] args) {
		int[] primitiveArr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };

		// Sorting Primitive int Array
		int[] sortedPrimitiveArr = Arrays.stream(primitiveArr).sorted().toArray();
		System.out.println(Arrays.toString(sortedPrimitiveArr));

		// Sorting Wrapper Integer Array
		// Convert primitive int array to Integer array using autoboxing
		Integer[] nonPrimitiveArr = Arrays.stream(primitiveArr).boxed().toArray(Integer[]::new);

		Integer[] sortedNonPrimitiveArr = Arrays.stream(nonPrimitiveArr).sorted(Comparator.reverseOrder())
				.toArray(Integer[]::new);
		System.out.println(Arrays.toString(sortedNonPrimitiveArr));

		// Sorting String Array
		String[] stringArr = { "Realme", "Vivo", "Apple", "Samsung", "Xiaomi", "Oppo" };

		String[] sortedStringArr = Arrays.stream(stringArr).sorted().toArray(String[]::new);
		System.out.println(Arrays.toString(sortedStringArr));
	}

}
