package naveenautomationlabs.integer;

import java.util.BitSet;
import java.util.stream.IntStream;

public class PrintNumbers {

	public static void main(String[] args) {
		/*
		 * Print from 1 to 100 without using loop and recursion
		 */

		BitSet bitSet = new BitSet();
		bitSet.set(1, 101);
		System.out.println(bitSet);

		// Using Stream
		IntStream.range(1, 101).forEach(s -> System.out.println(s));
	}

}
