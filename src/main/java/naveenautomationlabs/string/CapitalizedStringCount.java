package naveenautomationlabs.string;

public class CapitalizedStringCount {

    public static void main(String[] args) {
        // get the count of total words in a given capitalized string

        // Approach 1
        String str = "NaveenAutomationLabsYoutube";
        int count = 0;
        for (char s : str.toCharArray()) {
            if (Character.isUpperCase(s)) {
                count++;
            }
        }
        System.out.println("Number of uppercase characters: " + count);

        // Approach 2
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count2++;
            }
        }
        System.out.println("Number of uppercase characters: " + count2);

        // streams
        long count3 = str.chars().filter(e -> e >= 'A' && e <= 'Z').count();
        System.out.println("Number of uppercase characters: " + count3);

        // streams
        long count4 = str.chars().filter(Character::isUpperCase).count();
        System.out.println("Number of uppercase characters: " + count4);

        long count5 = str.chars().filter(e -> Character.isLowerCase(e)).count();
        System.out.println("Number of lowercase characters: " + count5);
    }

}
