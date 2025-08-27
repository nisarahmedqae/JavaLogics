package questions;

public class GenerateIntFromChar {

    public static void main(String[] args) {
        int subtractChar = 'a' - 'A'; // 32
        int subtractChar2 = 'A' - 'a'; // -32
        int divideChar = 'A' / 'a'; // 0
        int divideChar2 = 'a' / 'A'; // 1
        int divideChar3 = 'A' / 'A'; // 1
        int divideChar4 = 'a' / 'a'; // 1

        System.out.println(subtractChar);
        System.out.println(subtractChar2);
        System.out.println(divideChar);
        System.out.println(divideChar2);
        System.out.println(divideChar3);
        System.out.println(divideChar4);
    }

}
