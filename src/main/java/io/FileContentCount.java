package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	static String path = System.getProperty("user.dir")
			+ "\\src\\main\\java\\io\\FileContentCount.txt";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// count total chars, words and lines in a given file

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String currLine = bufferedReader.readLine().trim(); // remove before and after space from line

		while (currLine != null) {
			lineCount++;

			// words
			String[] words = currLine.split(" ");
			wordCount = wordCount + words.length;

			// chars
			for (String singlWord : words) {
				charCount = charCount + singlWord.length();
			}
			currLine = bufferedReader.readLine();
		}

		System.out.println("total lines: " + lineCount);
		System.out.println("total words: " + wordCount);
		System.out.println("total chars: " + charCount);
	}

}
