package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimenstionalArrayTest
{
   @DataProvider
	public Object[][] data()
	{
	    Object[][]obj=new Object[3][3]	;
	    obj[0][0]="banglore";
	    obj[0][1]="mysore";
	    obj[0][2]=200;
	    
	    obj[1][0]="bidar";
	    obj[1][1]="aurad";
	    obj[1][2]=40;
	    
	    obj[2][0]="bidar";
	    obj[2][1]="banglore";
	    obj[2][2]=123;
	    return obj;
	}
   
   @Test(dataProvider="data")
   public void display(String from ,String to,int price)
   {
	   System.out.print(from+"   ");
	   System.out.print(to+"  ");
	   System.out.print(price+"  ");
	   System.out.println();
   }
	    
	    
	    
	    
	
}
