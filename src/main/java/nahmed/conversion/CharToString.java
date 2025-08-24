package nahmed.conversion;

public class CharToString {

    public static void main(String[] args) {
        // Convert char to String using Character.toString()
        char singleChar = 'n';
        String charToString1 = Character.toString(singleChar);
        System.out.println("Char to String (method 1 - Character.toString): " + charToString1);

        // Convert char to String using concatenation
        String charToString2 = singleChar + "";
        System.out.println("Char to String (method 2 - Concatenation): " + charToString2);

    }
}
