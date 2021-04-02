package com.CalledPropFromDiffClass.File;

import java.io.IOException;
import java.util.Properties;

import com.CallingProp.File.Calling;

public class CalledProperties {
	public static Properties propX;
	
	public static void main(String args[]) throws IOException
	{
		//creating parent object in child class
		Calling c = new Calling();
		propX=c.setProperties();
		System.out.println(propX.getProperty("user"));
		System.out.println(propX.getProperty("password"));
		
		
		
	}

}
