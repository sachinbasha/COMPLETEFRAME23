package com.trendcart.genricUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class DatabaseUtils
{
	Connection con=null;
	public void connectDb() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IpathConstants.DBURL,IpathConstants.DBUSERNAME,IpathConstants.DBPASSWORD);
	}
	public String excecuteAndGetData(int colData,String ExpData,String query) throws SQLException
	{
		
		java.sql.Statement state = con.createStatement();
		//String query="select*from student;";
		ResultSet result=state.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actual =result.getString(colData);
			if(actual.equalsIgnoreCase(ExpData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("project created sucesfully");
			return ExpData;
		}
		else
		{
			System.out.println("project is not created sucesfully");
		}
		return "";
   }
	public void disconnectDB() throws SQLException
	{
		con.close();
	}

}
