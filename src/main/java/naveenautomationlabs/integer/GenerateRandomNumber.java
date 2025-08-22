package naveenautomationlabs.integer;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
    // Generate Random number in java
    // 1. Random Class
    // 2. ThreadLocalRandom

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("---------Random---------");
        System.out.println("random int: " + random.nextInt());
        System.out.println("random double: " + random.nextDouble());
        System.out.println("random float: " + random.nextFloat());
        System.out.println("random boolean: " + random.nextBoolean());


        System.out.println("---------ThreadLocalRandom---------");
        System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println(ThreadLocalRandom.current().nextDouble());
        System.out.println(ThreadLocalRandom.current().nextFloat());
        System.out.println(ThreadLocalRandom.current().nextBoolean());


        System.out.println("------range------------");
        System.out.println("random int: " + random.nextInt(0, 100)); // range 0 to 100
        System.out.println("ThreadLocalRandom int: " + ThreadLocalRandom.current().nextInt(0, 100)); // range 0 to 100

    }

}
