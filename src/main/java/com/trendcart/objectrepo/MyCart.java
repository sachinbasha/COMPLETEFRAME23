package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCart 
{
	@FindBy(xpath="//a[@href='#']/i[@class='icon fa fa-user']/..")
	private WebElement welcomlink;
	
	@FindBy(xpath="//a[text()=' Electronics']")
	private WebElement electroniccategory;
	
	@FindBy(name="billingaddress")
	private WebElement billingaddress;
	
	@FindBy(name="shippingaddress")
	private WebElement shippingaddress;
	
	@FindBy(name="shippingstate")
	private WebElement shippingstate;
	
	@FindBy(name="shippingcity")
	private WebElement shippingcity;
	
	@FindBy(name="shippingpincode")
	private WebElement shippingpincode;
	
	@FindBy(name="bilingstate")
	private WebElement bilingstate;

	@FindBy(name="billingcity")
	private WebElement billingcity;
	
	@FindBy(name="billingpincode")
	private WebElement billingpincode;
	
	@FindBy(name="shipupdate")
	private WebElement shipupdate;
	
	@FindBy(name="ordersubmit")
	private WebElement procedtocheckout;
	
	public void procedtocheckout()
	{
		procedtocheckout.click();
	}

	
	public WebElement getShippingaddress() {
		return shippingaddress;
	}

	public WebElement getShippingstate() {
		return shippingstate;
	}

	public WebElement getShippingcity() {
		return shippingcity;
	}

	public WebElement getShippingpincode() {
		return shippingpincode;
	}

	public WebElement getShipupdate() {
		return shipupdate;
	}

	public WebElement getWelcomlink() {
		return welcomlink;
	}

	public WebElement getElectroniccategory() {
		return electroniccategory;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getBilingstate() {
		return bilingstate;
	}

	public WebElement getBillingcity() {
		return billingcity;
	}

	public WebElement getBillingpincode() {
		return billingpincode;
	}

	public MyCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	 
}
