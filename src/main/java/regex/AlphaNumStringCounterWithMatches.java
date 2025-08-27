package regex;

public class AlphaNumStringCounterWithMatches {

    public static void main(String[] args) {
        String[] arr = {"1", "first", "second", "FIRST", "SECOND", "THIRD", "MiX", "23first", "56second", "M22ix", "FIRST12", "SECOND34", "THIRD56"};
        int smallAlphaNumericCount = 0;
        int capitalAlphaNumericCount = 0;
        int mixAlphaNumericCount = 0;
        int intCount = 0;
        int smallWordsCount = 0;
        int capitalWordsCount = 0;
        int mixWordsCount = 0;

        // .* will check regardless of other things in the string
        for (String ele : arr) {
            if (ele.matches(".*[a-z].*") && ele.matches(".*[A-Z]+.*") && ele.matches(".*[0-9]+.*")) {
                mixAlphaNumericCount++;
            } else if (ele.matches(".*[a-z]+.*") && ele.matches(".*[0-9]+.*")) {
                smallAlphaNumericCount++;
            } else if (ele.matches(".*[A-Z].*") && ele.matches(".*[0-9]+.*")) {
                capitalAlphaNumericCount++;
            } else if (ele.matches("[0-9]+")) {
                intCount++;
            } else if (ele.matches("[a-z]+")) {
                smallWordsCount++;
            } else if (ele.matches("[A-Z]+")) {
                capitalWordsCount++;
            } else if (ele.matches("[a-zA-Z]+")) {
                mixWordsCount++;
            }
        }

        System.out.println("Number of Mix alphanumeric strings: " + mixAlphaNumericCount); //1
        System.out.println("Number of small alphanumeric strings: " + smallAlphaNumericCount); //2
        System.out.println("Number of capital alphanumeric strings: " + capitalAlphaNumericCount); //3
        System.out.println("Number of integers: " + intCount); //1
        System.out.println("Number of small words: " + smallWordsCount); //2
        System.out.println("Number of capital words: " + capitalWordsCount); //3
        System.out.println("Number of mix words: " + mixWordsCount); //1
    }
}