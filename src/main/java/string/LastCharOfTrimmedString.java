package string;

public class LastCharOfTrimmedString {

    public static void main(String[] args) {

        String str = "    my name is khan             ";
        char[] arr = str.trim().toCharArray();
        int lastIndex = arr.length - 1;

        System.out.println(arr[lastIndex]);

    }

}
