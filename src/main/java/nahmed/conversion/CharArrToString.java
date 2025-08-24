package nahmed.conversion;

import java.util.Arrays;

public class CharArrToString {

    public static void main(String[] args) {
        char[] digits = {'1', '5', '6', '2', '8', '4', '6', '9'};

        // char[] to String
        String charArrString = new String(digits);

        System.out.println("Character Array to String: " + charArrString);

    }

}
