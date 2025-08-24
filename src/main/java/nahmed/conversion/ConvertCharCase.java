package nahmed.conversion;

public class ConvertCharCase {

	public static void main(String[] args) {

		char lowerChar = 'c';
		char upperChar = 'A';

		char toUpper = (char) (lowerChar - 32);
		char toLower = (char) (upperChar + 32);

		System.out.println("toUpper " + lowerChar + " : " + toUpper);
		System.out.println("toLower " + upperChar + " : " + toLower);

	}

}
