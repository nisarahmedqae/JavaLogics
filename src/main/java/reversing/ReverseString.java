package reversing;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String

		// Approach 1
		String str = "madam";
		String temp = "";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			temp = temp + ch[i];
		}
		System.out.println(temp);

		if (str.equals(temp)) {
			System.out.println("String is Palindrome");
		}

		// Approach 2
		String str2 = "madam";
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer revSb = sb.reverse();
		System.out.println(revSb);
	}

}
