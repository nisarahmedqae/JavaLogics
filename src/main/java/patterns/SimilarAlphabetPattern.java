package patterns;

public class SimilarAlphabetPattern {

    public static void main(String[] args) {

        int A = 65; // A=65 // a=97

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) A + " ");
            }
            A++;
            System.out.println();
        }

    }

}
