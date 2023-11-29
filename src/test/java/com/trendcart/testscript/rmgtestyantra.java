package com.trendcart.testscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rmgtestyantra {

	public static void main(String[] args) throws SQLException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.name("username")).sendKeys("rmgyantra");
        driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys("TY_proj_1899603");
		driver.findElement(By.name("createdBy")).sendKeys("Deepak-hr");
    	WebElement dropdown = driver.findElement(By.name("status"));
		Select s=new Select(dropdown);
	    s.selectByValue("On Going");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		String Actual_projectname="TY_proj_1899603";
		boolean flag=false;
		//rigester driver
		Driver driver1=new Driver();
		DriverManager.registerDriver(driver1);
		//get coonection frome data base
	Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		
		//create statement
		 java.sql.Statement state = con.createStatement();
		 String query="select* from project;";
		 
		 //Execute query
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			String project_name=result.getString(4);
			if(project_name.equalsIgnoreCase(Actual_projectname))
		    {
				System.out.println("project created succsefully");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("project created was failed");
		}
		
		//close data base
		con.close();
	}

}
