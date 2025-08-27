package concatenation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateStringList {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Dog", "Cat");
        List<String> list2 = Arrays.asList("parrot", "crow");

        List<String> concatenatedList = new ArrayList<>();
        concatenatedList.addAll(list1);
        concatenatedList.addAll(list2);

        System.out.println(concatenatedList);

    }

}
