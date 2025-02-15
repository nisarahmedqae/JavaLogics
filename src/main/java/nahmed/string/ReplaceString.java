package nahmed.string;

public class ReplaceString {

	public static void main(String[] args) {
		String name = "my name is khan";
		String[] splittedStr = name.split(" ");

		String blank = "";

		for (String ele : splittedStr) {
			if (ele.equals("khan")) {
				ele = "ahmed";
			}
			blank = blank + ele + " ";
		}

		System.out.println(blank);

	}

}
