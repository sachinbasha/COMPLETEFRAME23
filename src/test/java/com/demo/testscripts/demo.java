package com.demo.testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) throws SQLException 
	{
		Random r=new Random();
		int age = r.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("plese enter the name");
		String name=sc.next();
		String url="jdbc:mysql://localhost:3306/employesdetails";
		String username="root";
		String password="root";
		Connection c = DriverManager.getConnection(url,username,password);
		Statement b = c.createStatement();
		String query="select* from employe;";
		ResultSet resut = b.executeQuery(query);
		boolean d=false;
		while(resut.next())
		{
			String actualname = resut.getString(1);
			if(actualname.equals(name))
			{
				d=true;
				System.out.println("sorry this name is already present enter some other name");
				break;
			    
			}
		}
		if(d==false)
		{
			String l = "insert into employe values('"+name+"',"+age+");";
			int n = b.executeUpdate(l);
			System.out.println(name+"   updated sucsesfull");
		}
		String as = "select* from employe;";
		ResultSet vb = b.executeQuery(as);
		while(vb.next())
		{
			System.out.println(vb.getString(1));
		}
		
		
	}
}



