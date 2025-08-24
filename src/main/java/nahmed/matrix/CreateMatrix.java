package nahmed.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter total columns: ");
        int cols = scanner.nextInt();

        // 2D Array
        int matrix[][] = new int[rows][cols];

        System.out.println("Please enter the matrix data: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // print the matrix with for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // print the matrix with forEach loop
        for (int[] arr : matrix) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // print the matrix with forEach loop
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
