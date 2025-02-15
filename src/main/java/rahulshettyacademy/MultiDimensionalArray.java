package rahulshettyacademy;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// 1. Print min number from matrix
		// 2. Print max number from same column

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = abc[0][0]; // Assuming min number is this, Incase some new min num found under if condition
								// then it will replace assume value as its globally defined variable
		int minColumn = 0;

		for (int i = 0; i < 3; i++) // row
		{
			for (int j = 0; j < 3; j++) // column
			{
				if (abc[i][j] < min) {
					min = abc[i][j];
					minColumn = j;
				}
			}

		}
		System.out.println(min);

		int max = abc[0][minColumn];

		for (int k = 0; k < 3; k++) // column
		{
			if (abc[k][minColumn] > max) {
				max = abc[k][minColumn];
			}
		}
		System.out.println(max);
	}

}
