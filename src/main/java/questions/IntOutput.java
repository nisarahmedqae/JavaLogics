package questions;

public class IntOutput {

	/*
	 * What will be the output when your print this?
	 */

	public static void main(String[] args) {

		int i = (byte) +(char) -(int) +(long) -1;
		System.out.println(i); // 1

		int j = (int) +(long) -1;
		System.out.println(j); // -1

		int k = (char) 1;
		System.out.println(k); // 1

		int l = (byte) 1;
		System.out.println(l); // 1

		System.out.println("*******************");

		System.out.println((byte) 1); // 1
		System.out.println((char) 1); // 
		System.out.println((int) 1); // 1
		System.out.println((long) 1); // 1
	}

}
