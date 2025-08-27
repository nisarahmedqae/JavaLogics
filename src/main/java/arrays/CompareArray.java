package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		// compare same indexes of two different arrays and create another array for
		// matching values

		int arr1[] = { 1, 4, 5, 7 };
		int arr2[] = { 6, 4, 3, 7 }; // {4,7}

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				arrList.add(arr1[i]);
			}
		}
		Object[] listToArray = arrList.toArray();
		System.out.println(Arrays.toString(listToArray));

	}

}
