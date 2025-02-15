package nahmed.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateStringList {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Dog", "Cat");
		List<String> list2 = Arrays.asList("parrot", "crow");

		List<String> concatenatedList = new ArrayList<>();

		for (String element : list1) {
			concatenatedList.add(element);
		}

		for (String element : list2) {
			concatenatedList.add(element);
		}

		System.out.println(concatenatedList);

	}

}
