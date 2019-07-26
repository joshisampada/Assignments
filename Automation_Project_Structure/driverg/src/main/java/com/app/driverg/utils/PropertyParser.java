package com.app.driverg.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyParser {

//public static ResourceBundle applicationResource = ResourceBundle.getBundle("com.app.OrangeHrm.TestSuite.config");


	public Properties loadProperty(String filePath) throws IOException{
		Properties props = new Properties();
		FileInputStream ip = new FileInputStream(filePath);
		props.load(ip);
		return props;
	}

}
