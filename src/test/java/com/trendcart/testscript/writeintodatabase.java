package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class writeintodatabase {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/employesdetails";
		String username="root";
		String pwd="root";
		Connection con=null;
		 con = DriverManager.getConnection(url,username,pwd);
		Statement stmt = con.createStatement();
		String SqlQuery1="drop table employes72;";
		int rst2 = stmt.executeUpdate(SqlQuery1);
		System.out.println("table was created sucsesfully");
		
		
		
	}

}
