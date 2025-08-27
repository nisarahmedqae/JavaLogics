package counters;

public class CountCharsFromString {

	public static void main(String[] args) {
		// count string occurence

		String name = "aaanjda";
		char ch = 'a';
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("character is present " + count + " times");
	}

}
