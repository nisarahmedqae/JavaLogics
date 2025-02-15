package naveenautomationlabs.string;

public class PrintHelloWorld {

	public static void main(String[] args) {
		/*
		 * Print Hello World without using semi colon(;)
		 */

		// 1
		if (System.out.printf("Hello World" + "\n") == null) {

		}

		// 2
		if (System.out.append("Hello World" + "\n") != null) {

		}

		// 3
		if (System.out.append("Hello World").equals(null)) {

		}
	}

}
