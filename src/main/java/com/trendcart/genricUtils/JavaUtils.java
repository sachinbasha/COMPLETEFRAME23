package com.trendcart.genricUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils 
{
	public int getRandomNo()
	{
	   Random ran=new Random();
	   int random = ran.nextInt(500);
	   return random;
	}
	
	public String systemDate()
	{
		Date date=new Date();
		String systemdate=date.toString();
		return systemdate;
	}
	public String systemDateInFormat()
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy HH-mm-ss");
		Date date=new Date();
		String systemDateInFormat=dateformat.format(date);
		return systemDateInFormat;
	}
	

}
