package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPortalAdminLogin 
{
	@FindBy(name="username")
	private WebElement unttextfield;
	
	@FindBy(name="password")
	private WebElement pwt;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	public ShoppingPortalAdminLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUnttextfield() {
		return unttextfield;
	}

	public WebElement getPwt() {
		return pwt;
	}

	public void  getLogin() {
		 login.click();
	}

	
	

}
