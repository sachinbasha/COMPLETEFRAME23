package com.trendcart.testscript1;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.trendcart.genricUtils.ExcelUtils;
import com.trendcart.genricUtils.FileUtils;
import com.trendcart.genricUtils.WebDriverUtils;
import com.trendcart.objectrepo.AdminChangePassword;
import com.trendcart.objectrepo.AdminManageUser;
import com.trendcart.objectrepo.ShoppingPortalAdminLogin;
import com.trendcart.objectrepo.ShoppingPortalHomePage;
import com.trendcart.objectrepo.ShoppingPortalSignin;

public class ManageUsers 
{
	public static void main(String[] args) throws IOException
	{
        WebDriver driver=new ChromeDriver();
		ShoppingPortalHomePage p=new ShoppingPortalHomePage(driver);
		ShoppingPortalSignin s=new ShoppingPortalSignin(driver);
		ShoppingPortalAdminLogin l=new ShoppingPortalAdminLogin(driver);
		AdminManageUser useradmin=new AdminManageUser(driver);
		WebDriverUtils u=new WebDriverUtils();
		ExcelUtils e=new ExcelUtils();
		FileUtils f=new FileUtils();
		String URL = f.readDataFromPropertyFile("url");
		String emailid=f.readDataFromPropertyFile("EmailAddress");
		String Password=f.readDataFromPropertyFile("Password");
		driver.get(URL);
		p.getlogin();
		String fullname = e.readDataFromeExcel("createcontect", 0, 1);
		String EmailAddress =e.readDataFromeExcel("createcontect", 1, 1);
		String ContactNo =e.readDataFromeExcel("createcontect", 2, 1);
		String createPassword =e.readDataFromeExcel("createcontect", 3, 1);
		String ConfirmPassword =e.readDataFromeExcel("createcontect", 4, 1);
		s.getCreatecontactfullnametextb().sendKeys(fullname);
		s.getCreatecontactemailidtext().sendKeys(EmailAddress);
		s.getCreatecontacttextfield().sendKeys(ContactNo);
		s.getCreatecontactpassword().sendKeys(createPassword);
		s.getCreatecontactconfirmpassword().sendKeys(ConfirmPassword);
		s.getCreatecontactSubmit();
		String text = u.alertgetText(driver);
		System.out.println(text);
		u.alertAccept(driver);
		String urladmin = f.readDataFromPropertyFile("urladmin");
		driver.get(urladmin);
		String adminname = f.readDataFromPropertyFile("usernameadmin");
		String adminpassword = f.readDataFromPropertyFile("Passwordadmin");
		l.getUnttextfield().sendKeys(adminname);
		l.getPwt().sendKeys(adminpassword);
		l.getLogin();
		AdminChangePassword cp=new AdminChangePassword(driver);
		cp.getManageusers().click();
		useradmin.getSearchBox().sendKeys(EmailAddress,Keys.ENTER);
     String actualtext = driver.findElement(By.xpath("(//tr[@class='odd'])//td[3]")).getText();
     System.out.println(actualtext);
     if(actualtext.equalsIgnoreCase(EmailAddress))
     {
	 System.out.println("user is succses fully rigisterd");
      }
     else
    	 System.out.println("user is succses fully not rigisterd"); 
	}

}
