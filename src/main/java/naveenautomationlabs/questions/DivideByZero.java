package naveenautomationlabs.questions;

public class DivideByZero {

	public static void main(String[] args) {
		/*
		 * what will be the output when you divide a number by zero? Number = Integer,
		 * double, float
		 */

		//System.out.println(9 / 0); // Arithmetic Exception
		//System.out.println(0 / 0); // Arithmetic Exception
		System.out.println(0.0 / 0); // NaN
		System.out.println(0.0 / 0.0); // NaN
		System.out.println(9.0 / 0); // Infinity
		System.out.println(12.33 / 0); // Infinity
		System.out.println(12.33 / 0.0); // Infinity
	}

}
