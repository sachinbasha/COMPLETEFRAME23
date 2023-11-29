package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readthedatafromdatabase {

	public static void main(String[] args) throws SQLException 
	{
	String dburl="jdbc:mysql://localhost:3306/sachin";
	String dbusername="root";
	String dbpassword="root";
	//get connection from data base
	Connection con = DriverManager.getConnection(dburl,dbusername,dbpassword);
	//create statement
	Statement stmt = con.createStatement();
	String sqlquery = "select* from employe;";
	//excecute query
	ResultSet rs = stmt.executeQuery(sqlquery);
	while(rs.next())
	{
	  System.out.println(rs.getString(1)+"  "+rs.getString(2));
	}
	

	}

}
