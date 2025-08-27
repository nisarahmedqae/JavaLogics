package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {

		String systemPath = System.getProperty("user.dir"); // Get the current working directory
		FileInputStream fileInputStream = new FileInputStream(systemPath + "\\src\\main\\java\\io\\data.properties");

		Properties properties = new Properties();
		properties.load(fileInputStream);

		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		properties.setProperty("browser", "chrome");
		System.out.println(properties.getProperty("browser"));
	}

}
