package com.trendcart.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage
{
	@FindBy(xpath="//a[text()=' ADD TO CART']")
	private WebElement addtocart;
	
	public ProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement addToCarrButton()
	{
		return addtocart;
	}

}
