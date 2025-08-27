package arrays;

public class AdjacentArray {

	public static void main(String[] args) {
		// Max difference between any adjacent index in array

		int[] arr = { 1, 4, 8, 15, 50 };

		int diff = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] > diff) {
				diff = arr[i + 1] - arr[i];
			}
		}
		System.out.println(diff);

	}

}
