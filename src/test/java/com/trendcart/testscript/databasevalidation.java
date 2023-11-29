package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Result;

public class databasevalidation {

	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/employesdetails";
		String username="root";
		String password="root";
		boolean flag=false;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("plese enter name");
		String name = sc.next();
	
		int age=r.nextInt();
		Connection c  = DriverManager.getConnection(url,username,password);
		Statement stmt = c.createStatement();
		String slqquery="select*from employe;";
		ResultSet resutset = stmt.executeQuery(slqquery);
		while(resutset.next())
		{
			String name1 = resutset.getString(1);
			if(name1.equalsIgnoreCase(name))
			{
				System.out.println("data is already added");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			stmt.executeUpdate("insert into employe values('"+name+"',"+age+");");
		}
		String Output="select*from employe;";
		ResultSet resultset1=stmt.executeQuery(Output);
		while(resultset1.next())
		{
			System.out.println(resultset1.getString(1)+" "+resultset1.getString(2));
		}
	
		c.close();
	}
}
	
	


