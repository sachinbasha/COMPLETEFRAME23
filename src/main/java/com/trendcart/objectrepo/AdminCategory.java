package com.trendcart.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCategory
{

	@FindBy(name="category")
	private WebElement categorytxt;
	
	@FindBy(name="description")
	private WebElement descriptiontxt;
	
	@FindBy(name="submit")
	private WebElement subbtn;
	
	
	public WebElement getCategorytxt() {
		return categorytxt;
	}

	public WebElement getDescriptiontxt() {
		return descriptiontxt;
	}

	public WebElement getSubbtn() {
		return subbtn;
	}

}
