package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminManageUser
{
	@FindBy(xpath="//input[@aria-controls='DataTables_Table_0']")
	private WebElement searchbox;
	
	public WebElement  getSearchBox()
	{
		return searchbox;
	}
	
	public AdminManageUser(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
