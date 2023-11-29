package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminChangePassword 
{
	@FindBy(xpath="//a[@class='collapsed']")
	private WebElement ordermanagmentdropdown;
	
	@FindBy(partialLinkText="Manage users")
	private WebElement Manageusers;
	
	@FindBy(linkText=" Create Category ")
	private WebElement CreateCategory;
	
	@FindBy(linkText="Sub Category ")
	private WebElement subCategory;
	
	@FindBy(linkText="Insert Product ")
	private WebElement insertProduct;
	
	@FindBy(linkText="Manage Products ")
	private WebElement ManageProducts ;
	
	@FindBy(linkText="User Login Log ")
	private WebElement userlogin;
	
	@FindBy(partialLinkText="Logout")
	private WebElement adminlogout;
	
	
	public AdminChangePassword(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrdermanagmentdropdown() {
		return ordermanagmentdropdown;
	}

	public WebElement getManageusers() {
		return Manageusers;
	}

	public WebElement getCreateCategory() {
		return CreateCategory;
	}

	public WebElement getSubCategory() {
		return subCategory;
	}

	public WebElement getInsertProduct() {
		return insertProduct;
	}

	public WebElement getManageProducts() {
		return ManageProducts;
	}

	public WebElement getUserlogin() {
		return userlogin;
	}

	public WebElement getAdminlogout() {
		return adminlogout;
	}

	
	
}
	
	



