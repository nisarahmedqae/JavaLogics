package naveenautomationlabs.string;

public class PrintNames {

	public static void main(String[] args) {
		// Print your name 1000 times without using any loop in your code
		String name = "naveen";
		String str = "i";
		
		str = str.replaceAll("i", "iiiiiiiiii"); // 10
		str = str.replaceAll("i", "iiiiiiiiii"); // 10x10=100
		str = str.replaceAll("i", "iiiiiiiiii"); // 100x10=1000

		str = str.replaceAll("i", name + "\n");
		System.out.println(str);
	}

}
 