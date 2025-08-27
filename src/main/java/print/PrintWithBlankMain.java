package print;

public class PrintWithBlankMain {

	// print hello world without using static block

	public static int printSomething() {
		System.out.println("hello world");
		return 1;
	}

	static int ele = printSomething();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
