package palindrome;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 16461;
        int revNum = 0;

        char[] arr = String.valueOf(num).toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = arr[i] - '0';
            revNum = revNum * 10 + digit;
        }
        System.out.println(revNum);

        if (num == revNum) {
            System.out.println(num + " Palindrome number");
        } else {
            System.out.println(num + " not a Palindrome number");
        }

    }
}