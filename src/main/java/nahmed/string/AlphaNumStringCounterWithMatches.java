package nahmed.string;

public class AlphaNumStringCounterWithMatches {

    public static void main(String[] args) {
        String[] arr = {"hello", "World", "23alpha", "10", "hel22", "arm"};

        int strCount = 0;
        int intCount = 0;
        int alphaNumericCount = 0;
        // .* will check regardless of other things in the string

        for (String ele : arr) {
            if (ele.matches(".*[A-Za-z].*") && ele.matches(".*[0-9]+.*")) {
                alphaNumericCount++;
            } else if (ele.matches(".*[A-Za-z].*")) {
                strCount++;
            } else if (ele.matches(".*[0-9]+.*")) {
                intCount++;
            }
        }
        System.out.println("Number of alphanumeric strings: " + alphaNumericCount);
        System.out.println("Number of strings: " + strCount);
        System.out.println("Number of integers: " + intCount);
    }
}