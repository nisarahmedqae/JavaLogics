package integer;

public class SwapVariables {

    public static void main(String[] args) {
        // sort the array with temp variable
        int a = 4;
        int b = 5;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

        // sort the array without a variable
        int x = 4;
        int y = 5;

        x = x + y; // x=9
        y = x - y; // y=4
        x = x - y; // x=5

        System.out.println("value of x: " + x);
        System.out.println("value of y: " + y);
    }

}
