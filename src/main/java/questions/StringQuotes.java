package questions;

public class StringQuotes {

	public static void main(String[] args) {
		System.out.println("\"Hello\""); // "Hello"
		System.out.println("/\"Hello\"/"); // /"Hello"/
		System.out.println("/\'Hello\'/"); // /'Hello'/
		System.out.println("\"/\"Hello\"/\""); // "/"Hello"/"
		System.out.println("\"/\'Hello\'/\""); // "/'Hello'/"

		// I love "java" and "programming" and "movies"
		System.out.println("I love \"java\" and \"programming\" and \"movies\"");

		// 'I love "java" and "programming" and "movies"'
		System.out.println("\'I love \"java\" and \"programming\" and \"movies\"\'");
	}

}
