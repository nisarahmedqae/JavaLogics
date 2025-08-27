package staticblock;

public class StaticBlockQuestion7 {

	/*
	 * Q7. what will be output of following class?
	 */

	static {
		System.out.println("Static Block");
	}
	
	//Below two will only be called after creating object of class
	{
		System.out.println("Instance Initialization Block");
	}

	StaticBlockQuestion7() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new StaticBlockQuestion7();
		// first preference will be given to Instance Initialization Block before constructor
		new StaticBlockQuestion7();
	}
}
