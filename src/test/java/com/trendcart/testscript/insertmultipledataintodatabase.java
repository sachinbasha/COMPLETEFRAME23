package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class insertmultipledataintodatabase {

	public static void main(String[] args) throws SQLException {
     Driver dri=new Driver();
	 DriverManager.registerDriver(dri);
	 String url="jdbc:mysql://localhost:3306/sachin";
	 String username="root";
	 String pasword="root";
	 Connection con = DriverManager.getConnection(url,username,pasword);
	 String sqlquery = "insert into employe(sal,ename)values(?,?);";
	PreparedStatement pstmt = con.prepareStatement(sqlquery);
	pstmt.setString(1, "1000");
	pstmt.setString(2, "boss");
	pstmt.execute();
	
	 System.out.println("done");
	  

	}

}
