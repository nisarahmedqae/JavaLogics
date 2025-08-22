package rahulshettyacademy;

import java.util.ArrayList;

public class UniqueNumbers {

    public static void main(String[] args) {
        // print unique numbers from the array

        int[] arr = {4, 5, 5, 5, 4, 6, 6, 9, 4};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!arrList.contains(arr[i])) {
                arrList.add(arr[i]);
            }
        }

        for (int unique : arrList) {
            System.out.println("Unique numbers are: " + unique);
        }
    }

}
