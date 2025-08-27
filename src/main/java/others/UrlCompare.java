package others;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class UrlCompare {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException {

		// Get your own IP Address
		System.out.println(InetAddress.getLocalHost());

		// what will be the output when you compare site URL with its ip address
		System.out.println(new URL("https://demo.testfire.net").equals(new URL("https://65.61.137.117")));

	}

}
