package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 50, 30, 40, 20, 60, 10, 80 };
		
		int searchEle = 20;
		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchEle) {
				System.out.println("Element found at: " + i);
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Element not found");
		}
	}

}
