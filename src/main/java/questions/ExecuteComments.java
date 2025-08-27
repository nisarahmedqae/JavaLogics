package questions;

public class ExecuteComments {

	public static void main(String[] args) {
		// can we execute comments in java
		// yes through Unicode Characters called carriage return
		// it will push everything in front of it to next line so it will not be considered as comment

		int value = 10;
		
		// \u000d value = 20;
		System.out.println(value);
		System.out.println(\u000d);
		System.out.println("Hello Programming");
	}

}
