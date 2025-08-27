package string;

public class StringFirstLetter {

	public static void main(String[] args) {
		// wap to print first letter of each word in the string

		String str1 = "I like java and automation";
		String[] splittedStr = str1.split(" ");
		
		for (int i = 0; i < splittedStr.length; i++) {
			System.out.println(splittedStr[i].charAt(0));
		}

	}

}
