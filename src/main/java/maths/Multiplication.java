package maths;

public class Multiplication {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // print 5 Multiplication table without using Multiply operator
        // Multiply 5*10=50 without using operator

        int a = 5;
        int b = 10;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + a;
        }
        System.out.println("Multiplication of 5*10= " + sum + "");
    }

}
