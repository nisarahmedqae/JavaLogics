package maths;

public class LeaderElements {

	// find out all the leader elements in a given array

	public static void findLeaders(int[] num) {
		if (num.length == 0) {
			return;
		}

		int max = num[num.length - 1];
		System.out.print(max + " ");

		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] num = { 92, 7, 12, 9, 8, 3 };
		findLeaders(num);

		int[] num1 = { 92, 11, 10, 9, 8, 14 };
		findLeaders(num1);

		int[] num3 = { 92, 11, 10, 9, 8, 14, 3, 3 };
		findLeaders(num3);

		int[] num4 = {};
		findLeaders(num4);
	}

}
