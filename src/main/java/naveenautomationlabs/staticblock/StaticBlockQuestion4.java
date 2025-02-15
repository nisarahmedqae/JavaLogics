package naveenautomationlabs.staticblock;

public class StaticBlockQuestion4 {

	/*
	 * Q4. How can we create objects if we make the constructor private?
	 */

	int age;

	public static int createObject() {
		StaticBlockQuestion4 obj1 = new StaticBlockQuestion4();
		obj1.age = 40;
		return obj1.age;
	}

	private StaticBlockQuestion4() {
		age = 30;
	}

	public static void main(String[] args) {

		StaticBlockQuestion4 obj = new StaticBlockQuestion4();
		System.out.println(obj.age);
	}

}
