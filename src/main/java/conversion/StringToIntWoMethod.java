package conversion;

public class StringToIntWoMethod {
	// WAP: write a program
	// wap to convert string to integer without using Integer.parseInt() method

	public static int stringToInt(String str) {
		char[] ch = str.toCharArray();
		int result = 0;

		for (int i = 0; i < ch.length; i++) {
			int asc = ch[i] - '0'; // ASCII value of the character '0'/zero i.e 48
			result = result * 10 + asc;
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "123";
		System.out.println(stringToInt(s) + 10);

	}

}
