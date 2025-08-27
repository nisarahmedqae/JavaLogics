package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionMatrix {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter total columns: ");
        int cols = scanner.nextInt();

        // 2D Array
        int matrix1[][] = new int[rows][cols];
        int matrix2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("Please enter the matrix 1 data: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Please enter the matrix 2 data: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Print matrix 1 data: ");
        for (int[] arr : matrix1) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Print matrix 2 data: ");
        for (int[] arr : matrix2) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction of two matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
