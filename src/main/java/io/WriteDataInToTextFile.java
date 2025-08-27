package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInToTextFile {

	public static void main(String[] args) throws IOException {

		String systemPath = System.getProperty("user.dir"); // Get the current working directory
		FileWriter fileWriter = new FileWriter(systemPath + "\\src\\main\\java\\io\\WriteFile.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Selenium with Java\n");
		bufferedWriter.write("Selenium with Python\n");
		bufferedWriter.write("RestAssured with Java\n");

		bufferedWriter.close();

		System.out.println("Finished Writing");
	}

}
