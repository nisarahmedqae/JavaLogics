package naveenautomationlabs.string;

import org.apache.commons.lang3.StringUtils;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// Remove all whitespaces from a string

		String str = "   This   is my java code";
		System.out.println(str.trim());

		String str2 = "   This   is my java code";
		System.out.println(str2.replaceAll("\\s", "")); // remove all white spaces

		String str3 = "   This   is my java code";
		String remString = StringUtils.deleteWhitespace(str3);
		System.out.println(remString);

		System.out.println("---------------------------");
		String str4 = "   This   is my java code";
		String blank = "";

		for (char ch : str4.toCharArray()) {
			if (ch != ' ') {
				blank = blank + ch;
			}
		}
		System.out.println(blank);

		System.out.println("---------------------------");
		String str5 = "   This   is my java code";
		String[] splitStr = str5.split("\\s");
		StringBuffer stringBuffer = new StringBuffer();
		
		for (String e : splitStr) {
			stringBuffer.append(e);
		}
		System.out.println(stringBuffer);
	}

}
