package naveenautomationlabs.integer;

public class ArmstrongNumber {

    // check given number is Armstrong number/ Narcissistic number
    // pluperfect digital invariant (PPDI) number/ plus perfect number

    public static boolean isArmStrongNumber(int num) {
        if (num < 0) {
            return false;
        }

        int power = String.valueOf(num).length();
        int sum = 0;

        for (int ele : String.valueOf(num).toCharArray()) {
            int factor = 1;
            for (int i = 0; i < power; i++) {
                factor = factor * Character.getNumericValue(ele);
            }
            sum = sum + factor;
        }

        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(0)); // true
        System.out.println(isArmStrongNumber(-1));
        System.out.println(isArmStrongNumber(153)); // true
        System.out.println(isArmStrongNumber(1674));
        System.out.println(isArmStrongNumber(12));
    }

}