package nahmed.conversion;

public class CharDigitToInt {

    public static void main(String[] args) {
        // Convert char digit to int
        char digitChar = '5';
        int digitToInt = digitChar - '0';
        System.out.println("Char digit to int (method 1): " + digitToInt);

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
