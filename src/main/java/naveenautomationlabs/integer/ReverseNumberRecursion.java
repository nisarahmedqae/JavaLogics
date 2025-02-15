package naveenautomationlabs.integer;

public class ReverseNumberRecursion {

	public static void main(String[] args) {
		rev(12345);
	}

	public static void rev(int number) {
		if (number < 10) {
			System.out.print(number);
		} else {
			System.out.print(number % 10); // 12345%10
			rev(number / 10);
		}
	}

}
