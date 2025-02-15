package naveenautomationlabs.string;

import java.util.stream.Stream;

public class VowelsCount {

	public static void main(String[] args) {
		// total number of vowels in a java string

		// Input string
		String str = "Nisar Ahmed";

		// Convert the input string to lowercase to make the counting case-insensitive
		str = str.toLowerCase();

		// Initialize a variable to store the vowel count
		int vowelCount = 0;

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is a vowel (a, e, i, o, or u)
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}

		// Print the vowel count
		System.out.println("Number of vowels in the string: " + vowelCount);

		// Count vowels using Java streams
		long vowelCountStream = Stream.of(str.split("")).filter(ch -> "aeiou".contains(ch)).count();
		System.out.println(vowelCountStream);

	}

}
