package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPortalSignin
{
	@FindBy(name="email")
	private WebElement emailtextfield;
	
	@FindBy(name="password")
	private WebElement pwttextfield;
	 
	@FindBy(name="login")
	private WebElement logibutton;
	
	@FindBy(name="fullname")
	private WebElement createcontactfullnametextb;
	
	@FindBy(name="emailid")
	private WebElement createcontactemailidtext;
	
	@FindBy(name="contactno")
	private WebElement createcontacttextfield;
	
	@FindBy(id="password")
	private WebElement createcontactpassword;
	
	@FindBy(name="confirmpassword")
	private WebElement createcontactconfirmpassword;
	
	@FindBy(name="submit")
	private WebElement createcontactsubmittbutton;
	
	
	
	public void getCreatecontactSubmit()
	{
		createcontactsubmittbutton.click();
	}
	
	
	public ShoppingPortalSignin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPwttextfield() {
		return pwttextfield;
	}

	public WebElement getLogibutton() {
		return logibutton;
	}

	public WebElement getCreatecontactfullnametextb() {
		return createcontactfullnametextb;
	}

	public WebElement getCreatecontactemailidtext() {
		return createcontactemailidtext;
	}

	public WebElement getCreatecontacttextfield() {
		return createcontacttextfield;
	}

	public WebElement getCreatecontactpassword() {
		return createcontactpassword;
	}

	public WebElement getCreatecontactconfirmpassword() {
		return createcontactconfirmpassword;
	}
	

}
