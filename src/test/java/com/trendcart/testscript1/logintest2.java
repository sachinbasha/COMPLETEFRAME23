package com.trendcart.testscript1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.trendcart.genricUtils.BaseClass;
import com.trendcart.objectrepo.MyCart;

public class logintest2 extends BaseClass{

	
	@Test
	public  void test2() throws IOException
	{
		 MyCart m=new MyCart(driver);
			String text = m.getWelcomlink().getText();
			System.out.println(text);
			if(text.contains("king"))
			{
				System.out.println("user home page is displayed 2");
			}
			else
				System.out.println("user home page is not displayed");
		}	
	}

	

