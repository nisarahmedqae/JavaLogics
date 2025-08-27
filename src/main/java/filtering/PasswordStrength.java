package filtering;

public class PasswordStrength {

    // length should be 16
    // 2 uppercase
    // 2 lowercase
    // 1 special character

    public static void main(String[] args) {
        String password = "NIisIa@bhbdch222222";

        passwordStrength(password);
    }

    public static boolean passwordStrength(String password) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitsCount = 0;
        int specialCharsCount = 0;

        boolean passwordStrength;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCaseCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCaseCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitsCount++;
            } else {
                specialCharsCount++;
            }
        }

        System.out.println("Uppercase Count: " + upperCaseCount);
        System.out.println("Lowercase Count: " + lowerCaseCount);
        System.out.println("Digits Count: " + digitsCount);
        System.out.println("Special Characters Count: " + specialCharsCount);

        if (upperCaseCount >= 2 && lowerCaseCount >= 2 && digitsCount >= 2 && specialCharsCount == 1
                && password.length() >= 16) {
            passwordStrength = true;
        } else {
            passwordStrength = false;
        }
        System.out.println("Password Strength: " + passwordStrength);
        return passwordStrength;
    }

}
