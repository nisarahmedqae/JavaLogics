package naveenautomationlabs.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// write java program to check whether two strings are anagram or not
		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("Listen", "Silen  t"));
		System.out.println(isAnagram("cat", "ACT"));
		System.out.println(isAnagram("lives", "lone"));
	}

	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}
	}

}
