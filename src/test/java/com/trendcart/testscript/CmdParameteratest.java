package com.trendcart.testscript;

import org.testng.annotations.Test;

public class CmdParameteratest
{
	@Test
	public void cmdpa()
	{
		String BROWSER =     System.getProperty("browser");
		String URL     =     System.getProperty("url");
		String USERNAME =    System.getProperty("username");
		String PASSWORD =    System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	
   }

}
