package com.demo.testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Database {

	public static void main(String[] args) throws SQLException 
	{
		Statement stmt=null;
		boolean flag=false;
		String url="jdbc:mysql://localhost:3306/employesdetails";
		String username="root";
		String password="root";
		Driver driver =new Driver();
		//DriverManager.registerDriver(driver);
		Connection cn = DriverManager.getConnection(url,username,password);
		 stmt = cn.createStatement();
		try
		{
		String sqlquery = "create table employe4 (ename varchar(20) not null, sal varchar(20) not null);";
        stmt.executeUpdate(sqlquery);
        System.out.println("table created succes");
        String sqlquery1 = "insert into employe4  value('sachin',10);";
        stmt.executeUpdate(sqlquery1);
        flag=true;
		}
		catch(Exception e)
		{
			System.out.println("table not created");
		}
		if(flag==true)
		{
			String sqlquery3 = "select* from employe4;";
			ResultSet b = stmt.executeQuery(sqlquery3);
			while(b.next())
			{
				String data = b.getString(1);
				if(data.equals("sachin"));
				System.out.println("data is sucses fully inserted");
				break;
			}
		}
          
           
		
		
		
		
		
		
		
				

	}

}
