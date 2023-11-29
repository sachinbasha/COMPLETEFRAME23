package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPortalPaymentMethod 
{
	
	@FindBy(xpath="//input[@value='Internet Banking']")
	private WebElement internetbankingradiobutton;
	
	@FindBy(name="submit")
	private WebElement submitbutton;
	
	
	
	public ShippingPortalPaymentMethod(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void getInternetBankingRadioButton()
	{
		internetbankingradiobutton.click();
	}
	public void getsubmitbutton()
	{
		submitbutton.click();
	}

}
