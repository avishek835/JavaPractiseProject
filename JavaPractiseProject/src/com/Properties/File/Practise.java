package com.Properties.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Practise {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("E:\\SELENIUM\\JavaPractiseProject\\src\\com\\Properties\\File\\Practise.properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

} 
