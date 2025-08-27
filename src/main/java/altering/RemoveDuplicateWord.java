package altering;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String name = "My name is Khan is my";
		String[] arr = name.toLowerCase().split(" ");
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if (!result.contains(arr[i])) {
				result = result + arr[i] + " ";
			}
		}

		System.out.println(result);

	}

}
