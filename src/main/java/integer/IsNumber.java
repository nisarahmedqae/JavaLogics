package integer;

public class IsNumber {

	// Check given number is valid or not
	// Check given phone number is valid -- 10 digits
	// Check given cc number is valid -- 16 digits

	public static boolean isCorrectPhoneNumber(String number) {
		// return number.matches("[0-9]{10}");
		return number.matches("\\d{10}");
	}

	public static boolean isNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("valid number: " + number);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("not a valid number: " + number);
			return false;
		}
	}

	public static boolean isValidPhoneNumber(String number) {
		if (number.length() == 10 && isNumber(number)) {
			System.out.println("valid phone number: " + number);
			return true;
		}
		System.out.println("not a valid phone number: " + number);
		return false;
	}

	public static boolean isValidCCNumber(String number) {
		if (number.length() == 16 && isNumber(number)) {
			System.out.println("valid CC number: " + number);
			return true;
		}
		System.out.println("not a valid CC number: " + number);
		return false;
	}

	public static void main(String[] args) {
		System.out.println("----------------isNumber------------------");
		System.out.println(isNumber("123a"));
		
		System.out.println("----------------isValidPhoneNumber------------------");
		System.out.println(isValidPhoneNumber("1234567899"));
		System.out.println(isValidPhoneNumber("90909"));
		
		System.out.println("----------------isValidCCNumber------------------");
		System.out.println(isValidCCNumber("90909"));
		
		System.out.println("----------------isCorrectPhoneNumber------------------");
		System.out.println(isCorrectPhoneNumber("1234567899"));
	}

}
