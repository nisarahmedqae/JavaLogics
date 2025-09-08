package arrays;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

    public static void main(String[] args) {
        // calculate average of array
        // total sum divide by array length is average

        int[] arr = {1, 2, 3, 4, 5};

        double sum = 0;
        for (int e : arr) {
            sum = sum + e;
        }
        System.out.println("Total = " + sum);
        System.out.println("Avg = " + sum / arr.length);

    }

}
