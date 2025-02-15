package sdet;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// with Ternary Operator

		int a = 2;
		int b = 4;
		int c = 8;

		int largest1 = a > b ? a : b; // Ternary Operator ?
		int largest2 = c > largest1 ? c : largest1;

		System.out.println(largest2 + " is largest number");
		
		System.out.println("--------------------------------");
		
		int smallest1 = a < b ? a : b; // Ternary Operator ?
		int smallest2 = c < smallest1 ? c : smallest1;

		System.out.println(smallest2 + " is smallest number");

	}

}
