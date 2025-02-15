package nahmed.others;

public class Conversion {

	public static void main(String[] args) {
		// Convert char digit to int
		char digitChar = '5';
		int digitToInt = digitChar - '0';
		System.out.println("Char digit to int (method 1): " + digitToInt);

		// Convert char to String using Character.toString()
		char singleChar = 'n';
		String charToString1 = Character.toString(singleChar);
		System.out.println("Char to String (method 1 - Character.toString): " + charToString1);

		// Convert char to String using concatenation
		String charToString2 = singleChar + "";
		System.out.println("Char to String (method 2 - Concatenation): " + charToString2);

		// Convert String to int
		String numericString = "123";
		int stringToInt = Integer.parseInt(numericString);
		System.out.println("String to int: " + stringToInt);

		// Convert char digit to int using String conversion
		char anotherDigitChar = '5';
		int charToIntUsingString = Integer.parseInt(String.valueOf(anotherDigitChar));
		System.out.println("Char digit to int (method 2 - String conversion): " + charToIntUsingString);

		// Convert char digit to int using Character class
		char yetAnotherDigitChar = '5';
		int charToIntUsingCharacter = Character.getNumericValue(yetAnotherDigitChar);
		System.out.println("Char digit to int (method 3 - Character.getNumericValue): " + charToIntUsingCharacter);
	}
}