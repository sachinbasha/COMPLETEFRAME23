package com.demo.testscripts;

import org.testng.annotations.Test;

public class ReadDataFromDiffrantClassDataprovider {

	@Test(dataProviderClass = readmultipledatafromexcel.class,dataProvider="data")
	public void test(String datao ,String data12)
	{
		System.out.println(datao+"     "+data12);
	}

}
