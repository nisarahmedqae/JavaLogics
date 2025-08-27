package matrix;

public class MinNumberFromMatrix {

    public static void main(String[] args) {
        // print min and max number in multi dimensional array 3*3 matrix

        /*
         * 2 4 5
         * 3 4 7
         * 1 2 9
         */

        int abc[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int row = abc.length;
        int column = abc[0].length;

        System.out.println(row);
        System.out.println(column);

        int min = abc[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
        }
        System.out.println(min);

    }

}
