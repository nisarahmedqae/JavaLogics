package nahmed.string;

import java.util.Arrays;

public class CountTheWords {

	public static void main(String[] args) {
		String str = "  Java     programming  java    oops  ";
		String[] strArr = str.trim().split("[ ]+");

		System.out.println(strArr.length);
	}
}