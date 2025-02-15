package nahmed.year2025;

import java.util.Arrays;

public class SplitStringWithMultipleDelimiters {

	public static void main(String[] args) {
		String str = "apple,    banana; cherry grape";
		String[] result = str.split("[ ,;]+");
		System.out.println(Arrays.toString(result));
	}

}
