package counters;

public class CountEvenAndOddDigits {

    public static void main(String[] args) {
        int num = 12345;
        int evenCount = 0;
        int oddCount = 0;

        for (int ele : String.valueOf(num).toCharArray()) {
            int digit = ele - '0';
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }

}
