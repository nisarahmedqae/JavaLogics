package sdet;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 50, 30, 40, 20, 60, 10, 80 };
		
		int searchEle = 20;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchEle) {
				System.out.println("Element found at: " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}
	}

}
