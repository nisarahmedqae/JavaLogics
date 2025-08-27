package filtering;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String[] arr = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Sauce Labs", "Azure", "GCP", "Amazon" };

		System.out.println("**********hash set**********");
		HashSet<String> data = new HashSet<>();
		HashSet<String> duplicateSet = new HashSet<>();

		for (String e : arr) {
			if (!data.add(e)) {
				duplicateSet.add(e);
			}
		}
		System.out.println(duplicateSet);

		System.out.println("**********streams**********");
		HashSet<String> data2 = new HashSet<>();

		Set<String> dupSet = Arrays.asList(arr).stream().filter(e -> data2.add(e) == false).collect(Collectors.toSet());
		System.out.println(dupSet);
	}

}
