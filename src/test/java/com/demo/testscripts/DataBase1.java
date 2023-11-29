package com.demo.testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class DataBase1 
{

	public static void main(String[] args) throws SQLException {
	    String url="jdbc:mysql://localhost:3306/employesdetails";
		String un="root";
		String pw="root";
		Connection cn = DriverManager.getConnection(url,un,pw);
		Statement stmt = cn.createStatement();
		String table1 = "create table student93(ENAME VARCHAR(20) NOT NULL,SAL varchar(20) NOT NULL);";
		String table2=  "create table student94(ENAME VARCHAR(20) NOT NULL,SAL varchar(20) NOT NULL);";
		String SqlQuery1="insert into student93 values('akash',4000),('amar',5000);";
		String SqlQuery2="insert into student94 values('akash',4000),('amar',5000);";
		int result1 = stmt.executeUpdate(table1);
		int result2 = stmt.executeUpdate(table2);
		int  result3 =stmt.executeUpdate(SqlQuery1);
		int  result4 =stmt.executeUpdate(SqlQuery2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3+"  "+result4);
		System.out.println("close coonection");
		String res = "select* from student94;";
		ResultSet r = stmt.executeQuery(res);
		while(r.next())
		{
			String data = r.getString(1);
			
			System.out.println(data);
		}
		
	}
	
}


