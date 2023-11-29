package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPortalHomePage 
{
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myaccount;
	
	@FindBy(xpath="//a[text()='Wishlist']")
	private WebElement Wishlist;
	
	@FindBy(xpath="//a[text()='My Cart']")
	private WebElement Mykart;
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	@FindBy(linkText="Login")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[text()='Track Order']")
	private WebElement trackorder;
	
	@FindBy(name="product")
	private WebElement searchTextfield;
	
	@FindBy(className="basket")
	private WebElement cart;
	
	public ShoppingPortalHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void getMyAccount()
	{
		 myaccount.click();
	}
	public void getWishList()
	{
		Wishlist.click();
	}
	public void getMyCart()
	{
		Mykart.click();
	}
	public void getLogout()
	{
		logout.click();
	}
	public void getTrackorder()
	{
		trackorder.click();
	}
	public void getSearchTextfield(String data)
	{
		searchTextfield.sendKeys(data);
	}
	public void getCart()
	{
		cart.click();
	}
	public void getlogin()
	{
		loginbutton.click();
	}
	
	
	
	
	
	
	

}
