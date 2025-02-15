package naveenautomationlabs.integer;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

	public static void main(String[] args) {
		// calculate average of array using
		// total sum divide by array length is average

		// simple loop
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double sum = 0;
		for (int e : arr) {
			sum = sum + e;
		}
		System.out.println("Total= " + sum);
		System.out.println("Avg= " + sum / arr.length);

		// streams
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg.getAsDouble());

	}

}
