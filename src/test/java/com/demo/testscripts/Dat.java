package com.demo.testscripts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dat {

	public static void main(String[] args) 
	{
		systemDate();
		
	}
    public static void  systemDate()
	{
	/*Date date=new Date();
    String systemdate=date.toString();
    System.out.println(date);*/
   SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy HH-mm-ss");
	Date date1=new Date();
	String systemDateInFormat=dateformat.format(date1);
    System.out.println(systemDateInFormat);
   
	}

	}


