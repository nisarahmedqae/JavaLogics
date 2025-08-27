package staticblock;

public class StaticBlockQuestion1 {

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    static {
        System.out.println("static block3");
    }

    public static void main(String[] args) {
        /*
         * Q1. Explain static blocks in java?
         */
        System.out.println("main method");
    }

}
