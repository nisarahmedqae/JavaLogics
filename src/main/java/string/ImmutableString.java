package string;

public class ImmutableString {

    public static void main(String[] args) {
        // String literal will point to original string which is stored in memory if
        // value is same

        String a = "hello"; // string literal
        String b = "hello";

        // Immutable means it can not be altered or change and will remain constant
        a.concat("world");
        System.out.println(a);

        // if we create another string then only we can concatenate
        String c = a.concat("world");
        System.out.println(c);

        // String object will create new memory every time bcoz of object creation
        String s = new String("hello");
        String s1 = new String("hello");

        System.out.println(a.equals(b)); // true bcoz content is same
        System.out.println(a == b); // true bcoz memory of string literal is same
        System.out.println(a.equals(s)); // true bcoz equals function checks for content
        System.out.println(a == s); // fail matching the memory references
        System.out.println(s == s1); // fail bcoz memory references are different as they are defined with string class

    }

}
