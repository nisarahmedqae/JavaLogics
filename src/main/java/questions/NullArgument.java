package questions;

public class NullArgument {

    public static void main(String[] args) {
        /*
         * pass null argument with method overloading with string and object types
         */

        test(null); // it will print String Argument
        // Although Object is super class of String
        // But string is most obvious choice so compiler will print String
    }

    public static void test(String s) {
        System.out.println("String Argument");
    }

    public static void test(Object o) {
        System.out.println("Object Argument");
    }
}
