package rahulshettyacademy;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // 1. Print min number from matrix
        // 2. Print max number from same column

        int abc[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int min = abc[0][0];
        int minColumn = 0;

        for (int i = 0; i < abc.length; i++) // row
        {
            for (int j = 0; j < abc[0].length; j++) // column
            {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                    minColumn = j;
                }
            }

        }
        System.out.println(min);

        int max = abc[0][minColumn];

        for (int k = 0; k < abc[0].length; k++) // column
        {
            if (abc[k][minColumn] > max) {
                max = abc[k][minColumn];
            }
        }
        System.out.println(max);
    }

}
