package counters;

public class AlphaNumStringCounter {

    public static void main(String[] args) {

        String[] arr = {"hello", "World", "23alpha", "10", "hel22", "arm"};

        int intCount = 0;
        int strCount = 0;
        int alphaNumericCount = 0;

        for (String ele : arr) {
            char[] charArr = ele.toCharArray();
            boolean hasDigit = false;
            boolean hasLetter = false;

            for (char ch : charArr) {
                if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
                    hasLetter = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                }
            }

            if (hasDigit && hasLetter) {
                alphaNumericCount++;
            } else if (hasDigit) {
                intCount++;
            } else if (hasLetter) {
                strCount++;
            }
        }
        System.out.println("Number of alphanumeric strings: " + alphaNumericCount);
        System.out.println("Number of strings: " + strCount);
        System.out.println("Number of integers: " + intCount);
    }

}
