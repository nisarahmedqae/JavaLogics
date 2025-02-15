package naveenautomationlabs.staticblock;

public class StaticData {

	static int age = 20;

	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}

}
