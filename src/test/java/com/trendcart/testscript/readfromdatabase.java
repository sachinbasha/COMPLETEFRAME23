package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class readfromdatabase {

	public static void main(String[] args) throws SQLException {
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		String url = "jdbc:mysql://localhost:3306/sachin";
		String pwd="root";
		String username="root";
	Connection cnt = DriverManager.getConnection(url,username,pwd);
	Statement stmt = cnt.createStatement();
	String sqlquery = "select* from employe;";
	ResultSet res = stmt.executeQuery(sqlquery);
	while(res.next())
	{
		System.out.println(res.getString(1)+"    "+res.getString(2));
	}
		
		

	}

}
