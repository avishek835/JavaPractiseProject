package com.CallingProp.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Calling {
	
	
	
	public Properties setProperties() throws IOException
	{
		Properties prop= new Properties();
		 FileInputStream ip =new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\CallingProp\\File\\Calling.properties");
		 prop.load(ip);
		return prop;
		 	
	 }
	


	
	
	
	
	
}
