package cleanup;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomString {

	public static void main(String[] args) {
		// Apache Commons Lang
		String randNum = RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);

		String randStr = RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);
	}

}
