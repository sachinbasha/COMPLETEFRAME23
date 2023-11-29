package com.trendcart.objectrepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory 
{
	@FindBy(xpath="(//form[@name='cart']//tr)[last()]")
	private WebElement lastrow;
	
	@FindBy(xpath="(//form[@name='cart']//tr)[last()]//h4/a")
	private WebElement lastrowmobilename;
	
	public OrderHistory (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement  lastRow()
	{
		return lastrow;
	}
	public WebElement grtlastrowmobilename()
	{
		return lastrowmobilename;
		
	}
	
	
}
