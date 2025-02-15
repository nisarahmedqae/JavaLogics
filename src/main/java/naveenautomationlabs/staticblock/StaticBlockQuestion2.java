package naveenautomationlabs.staticblock;

public class StaticBlockQuestion2 {

	public static void main(String[] args) {
		/*
		 * Q2. How can we run a java program without making any object?
		 * Q3. Similarity and Difference between static block and static method?
		 */
		System.out.println("main method");
		test();
		StaticBlockQuestion2.test();
		cover();
	}

	static {
		System.out.println("static block");
	}

	public static void test() {
		System.out.println("testing method");
	}
	
	public static void cover() {
		System.out.println("cover method");
		test();
	}
}
