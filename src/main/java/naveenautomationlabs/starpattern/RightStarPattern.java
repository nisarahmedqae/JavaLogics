package naveenautomationlabs.starpattern;

public class RightStarPattern {

    public static void main(String[] args) {

        // i=row, k=spaces, j=column
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}