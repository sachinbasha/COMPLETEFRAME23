package com.trendcart.genricUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils
{
	/**
	 * this method is used read the data from property file
	 * @author sachin
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
	  FileInputStream fis=new FileInputStream(IpathConstants.FILEPATH);
	  Properties p=new Properties();
	  p.load(fis);
      String value = p.getProperty(key);
      return value;
	}
	

}
