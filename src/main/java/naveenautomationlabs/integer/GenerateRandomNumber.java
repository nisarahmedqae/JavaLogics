package naveenautomationlabs.integer;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
	// Generate Random number in java
	// 1. Random Class
	// 2. Math.random()
	// 3. ThreadLocalRandom

	// Use Cases:
	// Random number in eamil
	// Random phone number

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("first random int: " + random.nextInt());

		for (int i = 0; i < 3; i++) {
			System.out.println("random int: " + random.nextInt());
			System.out.println("random double: " + random.nextDouble());
			System.out.println("random float: " + random.nextFloat());
			System.out.println("random boolean: " + random.nextBoolean());
		}

		System.out.println("------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(Math.random());
		}

		System.out.println("------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
			System.out.println(ThreadLocalRandom.current().nextDouble());
			System.out.println(ThreadLocalRandom.current().nextFloat());
			System.out.println(ThreadLocalRandom.current().nextBoolean());
		}

		System.out.println("------range------------");
		for (int i = 0; i < 3; i++) {
			System.out.println("random int: " + random.nextInt(100)); // range 0 to 100
			System.out.println(ThreadLocalRandom.current().nextInt(0, 100)); // range 0 to 100
		}
	}

}
