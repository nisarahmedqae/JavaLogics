package nahmed.others;

public class MatrixPrint {

	public static void main(String[] args) {

		String[][] arr = { { "A1", "A2", "A3" }, { "B1", "B2", "B3" }, { "C1", "C2", "C3" } };
		int row = arr.length;
		int col = arr[0].length;

		System.out.println("Print row: A");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[0][i]);
			System.out.print(" ");
		}

		System.out.println("\n\nPrint row: B");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[1][i]);
			System.out.print(" ");
		}

		System.out.println("\n\nPrint row: C");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[2][i]);
			System.out.print(" ");
		}

		System.out.println("\n\nPrint col: 1");
		for (int i = 0; i < row; i++) {
			System.out.println(arr[i][0]);
		}

		System.out.println("\nPrint col: 2");
		for (int i = 0; i < row; i++) {
			System.out.println(arr[i][1]);
		}

		System.out.println("\nPrint col: 3");
		for (int i = 0; i < row; i++) {
			System.out.println(arr[i][2]);
		}

		System.out.println("\nPrint diagonal: A1 B2 C3");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[i][i]);
			System.out.print(" ");
		}

		System.out.println("\n\nPrint diagonal: A3 B2 C1");
		for (int i = 0; i < row; i++) {
			System.out.print(arr[i][col - 1 - i]);
			System.out.print(" ");

		}
	}

}
