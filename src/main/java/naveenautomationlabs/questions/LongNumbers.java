package naveenautomationlabs.questions;

public class LongNumbers {

    public static void main(String[] args) {
        /*
         * what will be the output when you use a Long number with L and without L
         * suffix?
         */

        long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;
        long longNumberWithL = 1000 * 60 * 60 * 24 * 365L;
        System.out.println(longNumberWithoutL); // 1471228928 but originalValue is 31536000000
        System.out.println(longNumberWithL); // 31536000000

        // Max limit of int is 32 bit : 2147483647
        // So without L java will remove over limit digits
    }

}
