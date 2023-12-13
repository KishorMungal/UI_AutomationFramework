package com.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {
	public static FileInputStream file;
	public static Properties prop;
	public static String Value;

	public static String getproperties(String key) throws IOException {
		try {
			file = new FileInputStream(
					System.getProperty("user.dir") + "/UI_AutomationFramework/src/test/resources/config.Properties");
			prop = new Properties();
			prop.load(file);

			Value = prop.get(key).toString();

			if (prop.get(key) == null) {
				System.out.println("property values is mismatched");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Value;
	}

}
