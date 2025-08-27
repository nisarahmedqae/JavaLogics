package staticblock;

public class StaticFinal {

    public static void main(String[] args) {
        System.out.println(Main.x);

    }

}

class Main {
    static final int x = 100; // if we remove final then only class will be loaded
    // and static block will execute else it will just take value of x with final
    // keyword

    static {
        System.out.println("main -- class static block...");
    }

}
