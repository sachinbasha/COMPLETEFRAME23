package com.demo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.trendcart.genricUtils.ListnerImplementation.class)
public class classextent 
{
	@Test
	public void test()
	{
		System.out.println("sachin");
		
	}

}
