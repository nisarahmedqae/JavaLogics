package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharToCharacter {

    public static void main(String[] args) {
        // List of Character
        long num = 121343;
        List<Character> list = String.valueOf(num).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(list);

        // Array of Character
        String str = "java";
        Character[] chrArray = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        System.out.println(Arrays.toString(chrArray));

    }
}