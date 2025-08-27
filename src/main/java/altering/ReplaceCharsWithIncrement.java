package altering;

public class ReplaceCharsWithIncrement {

	public static void main(String[] args) {
		String input = "tomorrow";
		String result = "";
		int count = 1;

		for (char ele : input.toCharArray()) {
			if (ele == 'o') {
				for (int i = 0; i < count; i++) {
					result = result + '&';
				}
				count++;
			} else {
				result = result + ele;
			}
		}

		System.out.println(result);
	}
}