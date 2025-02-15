package nahmed.string;

import java.util.Arrays;

public class CountTheWords {

	public static void main(String[] args) {
		String str = "  Java     programming  java    oops  ";
		String[] strArr = str.split(" ");
		int count = 0;
		System.out.println(Arrays.toString(strArr));

		for (String ele : strArr) {
			if (!ele.equals("")) { // Check for non-empty strings
				count++;
			}
		}
		System.out.println(count);
	}
}