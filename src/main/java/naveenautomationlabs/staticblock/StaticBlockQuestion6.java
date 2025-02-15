package naveenautomationlabs.staticblock;

public class StaticBlockQuestion6 {

	/*
	 * Q6. Can we initialize member variables within static block?
	 */

	String name;
	static int age;
	static {
		StaticBlockQuestion6 sbq = new StaticBlockQuestion6();
		sbq.name = "Naveen";
		age = 25;

		System.out.println(sbq.name + " " + age);
	}

	public static void main(String[] args) {

	}
}
