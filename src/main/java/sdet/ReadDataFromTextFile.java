package sdet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        // Approach 1
        String systemPath = System.getProperty("user.dir");
        FileReader fileReader = new FileReader(systemPath + "\\src\\main\\java\\sdet\\DataFile.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currLine = bufferedReader.readLine().trim(); // remove before and after space from line

        while (currLine != null) {
            System.out.println(currLine);
            currLine = bufferedReader.readLine();
        }
        bufferedReader.close();

        // Approach 2
        File file = new File(systemPath + "\\src\\main\\java\\sdet\\DataFile.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

    }

}
