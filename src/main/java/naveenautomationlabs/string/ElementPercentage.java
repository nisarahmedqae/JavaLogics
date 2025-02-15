package naveenautomationlabs.string;

import java.text.DecimalFormat;

public class ElementPercentage {

	// find percentage of uppercase letters, lowercase letters, digits and special
	// characters

	public static void getCharPercentage(String str) {
		int len = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digits = 0;
		int specChars = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specChars++;
			}
		}
		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitsPercentage = (digits * 100.0) / len;
		double specCharsPercentage = (specChars * 100.0) / len;

		System.out.println("In the given String: " + str);
		DecimalFormat decimalFormat = new DecimalFormat("##.##");
		System.out.println("upperCasePercentage --> " + decimalFormat.format(upperCasePercentage));
		System.out.println("lowerCasePercentage --> " + decimalFormat.format(lowerCasePercentage));
		System.out.println("digitsPercentage --> " + decimalFormat.format(digitsPercentage));
		System.out.println("specCharsPercentage --> " + decimalFormat.format(specCharsPercentage));

		System.out.println(
				"Total: " + (upperCasePercentage + lowerCasePercentage + digitsPercentage + specCharsPercentage));
		System.out.println("---------------------------------------------");
	}

	public static void main(String[] args) {
		getCharPercentage("Naveen AutomationLabs 123 %#");
		getCharPercentage("N");
		getCharPercentage("n");
		getCharPercentage("1");
		getCharPercentage(" ");

	}

}
