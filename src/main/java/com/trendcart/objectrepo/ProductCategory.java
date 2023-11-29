package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategory 
{
	@FindBy(xpath="//a[text()='Redmi Note 4 (Gold, 32 GB)  (With 3 GB RAM) Demo']")
	private WebElement redinote4mobile;
	
	public ProductCategory(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getRedmiNote4()
	{
		return redinote4mobile;
		
	}

}
