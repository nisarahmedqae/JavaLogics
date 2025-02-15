package nahmed.string;

public class ChangeCaseOfString {

	public static void main(String[] args) {
		// Even numbers to capital
		// As its starting from 0th index so even numbers will start from 0,2,4 and so

		String name = "mynameiskhan";
		char[] charArr = name.toCharArray();

		String blank = "";

		for (int i = 0; i < charArr.length; i++) {
			char ch = charArr[i];

			if (i % 2 == 0 && (ch >= 'a' && ch <= 'z')) {
				ch = (char) (ch - 32);
			} else if (i % 2 != 0 && (ch >= 'A' && ch <= 'Z')) {
				ch = (char) (ch + 32);
			}

			blank = blank + ch;
		}

		System.out.println(blank);
	}

}
