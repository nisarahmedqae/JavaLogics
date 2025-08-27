package reversing;

public class ReverseWordsKeepingSpacesIntact {

	public static void main(String[] args) {

		String str = "Welcome to java";
		char[] arr = str.toCharArray();
		char[] result = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				result[i] = ' ';
			}
		}

		int index = 0;
		for (int i = arr.length-1; i >=0 ; i--) {
			if (arr[i] != ' ') {
				while (result[index] == ' ') {
					index++;
				}
				result[index] = arr[i];
				index++;
			}
		}
		System.out.println(result);
	}
}