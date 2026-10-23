package q27;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Q27 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\Vinayak\\OneDrive\\Desktop\\vinayak\\SetA\\src\\q27\\Untitled2");
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}
}
