package naveenautomationlabs.matrix;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = 3;
		int cols = 3;
		int[][] transpose = new int[cols][rows];

		System.out.println("Print the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		// create transpose matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("Print the transpose matrix with forEach loop:");
		for (int[] r : transpose) {
			System.out.println(Arrays.toString(r));
		}
	}

}
