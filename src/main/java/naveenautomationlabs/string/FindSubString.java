package naveenautomationlabs.string;

public class FindSubString {

	public static void main(String[] args) {
		// check if substring is present in a given string

		String mainString = "Hello, World!";
		String substring = "World";

		// 1. Using contains() method:
		if (mainString.contains(substring)) {
			System.out.println("Substring found.");
		} else {
			System.out.println("Substring not found.");
		}

		// 2. Using indexOf() method:
		if (mainString.indexOf(substring) != -1) {
			System.out.println("Substring found.");
		} else {
			System.out.println("Substring not found.");
		}
	}

}
