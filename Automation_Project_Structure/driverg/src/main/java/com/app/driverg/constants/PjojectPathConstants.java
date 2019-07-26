package com.app.driverg.constants;

import java.io.File;

public class PjojectPathConstants {
	
	public static String currentdir = System.getProperty("user.dir") + File.separator;
	public static String resources = currentdir + "src" + File.separator + "main" + File.separator + "resources" + File.separator;
	
	//config
	public static String config = resources + "config.properties";
	
	//register user
	public static String registeruser = resources + "registeruser.properties";
	

}
