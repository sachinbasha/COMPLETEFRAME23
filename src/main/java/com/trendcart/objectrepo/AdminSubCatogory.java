package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSubCatogory {

	@FindBy(xpath="//select[@name='category']")
	private WebElement categorydropdown;
	
	@FindBy(name="subcategory")
	private WebElement SubCategorynametxt;
	
	@FindBy(name="submit")
	private WebElement createbutn;
	
	public AdminSubCatogory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategorydropdown() {
		return categorydropdown;
	}

	public WebElement getSubCategorynametxt() {
		return SubCategorynametxt;
	}

	public WebElement getCreatebutn() {
		return createbutn;
	}
	
	

}
