package print;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		/*
		 * Print 1 to 100 without using any loop 1= Recursive function/ Recursion
		 */

		printNum(1);
		System.out.println("--------------------------");
		printNumber(5, 50);

	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	public static void printNumber(int startNum, int endNum) {
		if (startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNumber(startNum, endNum);
		}
	}

}
