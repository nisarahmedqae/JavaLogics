package reversing;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		System.out.println("----------------------------");

		int num2 = 12345;
		StringBuffer sb = new StringBuffer(String.valueOf(num2));
		StringBuffer revSb = sb.reverse();
		System.out.println(revSb);

		System.out.println("----------------------------");

		int num3 = 12345;
		StringBuilder sbl = new StringBuilder();
		sbl.append(num3);
		StringBuilder revSbl = sbl.reverse();
		System.out.println(revSbl);
	}

}
