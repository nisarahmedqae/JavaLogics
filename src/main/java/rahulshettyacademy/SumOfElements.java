package rahulshettyacademy;

public class SumOfElements {

	public static void main(String[] args) {
		// create a method which accepts array and returns sum of all the elements in array

		int[] arr = { 1, 2, 3, 4, 5 };

		int sum = sumArray(arr);
		System.out.println(sum);
	}

	private static int sumArray(int[] arr) {
		int sum = 0;
		// extract every value of array and sum each value with other
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(a[i]);
			sum = sum + arr[i];
		}
		return sum;
	}

}
