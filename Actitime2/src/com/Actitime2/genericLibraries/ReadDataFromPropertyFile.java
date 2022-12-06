package com.Actitime2.genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	
	public String ReadData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata1.property");
		Properties p= new Properties();
		p.load(fis);
    	String value = p.getProperty(key);
		return value;
    	
	}
}

