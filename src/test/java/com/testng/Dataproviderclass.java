package com.testng;

import org.testng.annotations.Test;

public class Dataproviderclass {

	
	@Test(dataProviderClass=TwoDimenstionalArrayTest.class ,dataProvider="data")
	public void display(String from ,String to,int price)
	   {
		   System.out.print(from+"   ");
		   System.out.print(to+"  ");
		   System.out.print(price+"  ");
		   System.out.println();
	   }
}
