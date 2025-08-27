package regex;

public class RemoveJunk {

    public static void main(String[] args) {
        String str = "!#$@$%#%&^*^& latin string 0123456789";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
		/* The ^ inside the brackets negates the set, meaning it matches everything
		 except the specified characters.
		 */
        System.out.println(str);

        String str2 = "@$%$^&%* testing @$%$^&%* selenium @$%$^&%* java";
        str2 = str2.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(str2);
    }

}
