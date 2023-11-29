package com.trendcart.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminInsertProduct {

		@FindBy(name="category")
		private WebElement categorydropdown;
		
		@FindBy(name="subcategory")
		private WebElement subcategorydroupdown;
		
		@FindBy(name="productName")
		private WebElement productnametxt;
		
		@FindBy(name="productCompany")
		private WebElement productCompanytxt;
		
		@FindBy(name="productpricebd")
		private WebElement productpricebeforetxt;
		
		@FindBy(name="productprice")
		private WebElement productpriceaftettext;
		
		@FindBy(name="productDescription")
		private WebElement productDescriptiontxt ;
		
		@FindBy(name="productShippingcharge")
		private WebElement productShippingchargetxt;
		
		@FindBy(name="productAvailability")
		private WebElement productAvailability;
		
		@FindBy(name="productimage1")
		private WebElement productimagefile1;
		
		@FindBy(name="productimage2")
		private WebElement productimagefile2;
		
		
		@FindBy(name="productimage3")
		private WebElement productimagefile3;
		
		@FindBy(name="submit")
		private WebElement createbtn;

		public WebElement getCategorydropdown() {
			return categorydropdown;
		}

		public WebElement getSubcategorydroupdown() {
			return subcategorydroupdown;
		}

		public WebElement getProductnametxt() {
			return productnametxt;
		}

		public WebElement getProductCompanytxt() {
			return productCompanytxt;
		}

		public WebElement getProductpricebeforetxt() {
			return productpricebeforetxt;
		}

		public WebElement getProductpriceaftettext() {
			return productpriceaftettext;
		}

		public WebElement getProductDescriptiontxt() {
			return productDescriptiontxt;
		}

		public WebElement getProductShippingchargetxt() {
			return productShippingchargetxt;
		}

		public WebElement getProductAvailability() {
			return productAvailability;
		}

		public WebElement getProductimagefile1() {
			return productimagefile1;
		}

		public WebElement getProductimagefile2() {
			return productimagefile2;
		}

		public WebElement getProductimagefile3() {
			return productimagefile3;
		}

		public WebElement getCreatebtn() {
			return createbtn;
		}
		
		
}
