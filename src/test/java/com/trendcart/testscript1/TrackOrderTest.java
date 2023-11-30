package com.trendcart.testscript1;

import static org.testng.Assert.*;
import com.trendcart.genricUtils.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.trendcart.genricUtils.ExcelUtils;
import com.trendcart.genricUtils.FileUtils;
import com.trendcart.genricUtils.WebDriverUtils;
import com.trendcart.objectrepo.MyCart;
import com.trendcart.objectrepo.OrderHistory;
import com.trendcart.objectrepo.ProductCategory;
import com.trendcart.objectrepo.ProductDetailPage;
import com.trendcart.objectrepo.ShippingPortalPaymentMethod;
import com.trendcart.objectrepo.ShippingPortalPaymentMethod;
import com.trendcart.objectrepo.ShoppingPortalHomePage;
import com.trendcart.objectrepo.ShoppingPortalSignin;
//@Listeners(com.trendcart.genricUtils.ListnerImplimentation.class)

public class TrackOrderTest extends BaseClass{

	@Test
	public  void TrackOrder() throws IOException, InterruptedException {
		FileUtils f=new FileUtils();
		WebDriverUtils u=new WebDriverUtils();
		ExcelUtils e=new ExcelUtils();
		MyCart m=new MyCart(driver);
		m.getElectroniccategory().click();
		//Assert.fail();
		ProductCategory productcatg=new ProductCategory(driver);
		productcatg.getRedmiNote4().click();
		ProductDetailPage detailpage=new ProductDetailPage(driver); 
		detailpage.addToCarrButton().click();
		String a = u.alertgetText(driver);
		String popuptext="Product has been added to the cart";
		if(popuptext.equalsIgnoreCase(a))
			System.out.println(popuptext+"popup is displayed");
		else
			System.out.println(popuptext+"popup is not displayed");
		u.alertAccept(driver);
		String billingaddress = e.readDataFromeExcel("shippingaddress", 0, 1);
		String bilingstate =  e.readDataFromeExcel("shippingaddress", 1, 1);
		String billingcity =   e.readDataFromeExcel("shippingaddress", 2, 1);
		String billingpincode = e.readDataFromeExcel("shippingaddress", 3, 1);
		m.getBillingaddress().clear();
		m.getBilingstate().clear();
		m.getBillingcity().clear();
		m.getBillingpincode().clear();
		m.getBillingaddress().sendKeys(billingaddress);
		m.getBilingstate().sendKeys(bilingstate);
		m.getBillingcity().sendKeys(billingcity);
		m.getBillingpincode().sendKeys(billingpincode);
		String shippingaddress  = e.readDataFromeExcel("billingaddress", 0, 1);
		String shippingstate = e.readDataFromeExcel("billingaddress", 1, 1);
		String shippingcity = e.readDataFromeExcel("billingaddress", 2, 1);
		String shippingpincode = e.readDataFromeExcel("billingaddress", 3, 1);
		m.getShippingaddress().clear();
		m.getShippingstate().clear();
		m.getShippingcity().clear();
		m.getShippingpincode().clear();
		m.getShippingaddress().sendKeys(shippingaddress);
		m.getShippingstate().sendKeys(shippingstate);
		m.getShippingcity().sendKeys(shippingcity);
		m.getShippingpincode().sendKeys(shippingpincode);
		m.getShipupdate().click();
		String alerttextexpected=u.alertgetText(driver);
		String actualpopuptext="Shipping Address has been updated";
		Assert.assertEquals(actualpopuptext, alerttextexpected);
		/*if(alerttext.equalsIgnoreCase(actualpopuptext))
		{
			System.out.println("Shipping Address has been updated pop up is displayed");
		}
		else 
			System.out.println("Shipping Address has been updated pop up is not displayed");*/
		u.alertAccept(driver);
		m.procedtocheckout();
		ShippingPortalPaymentMethod pm=new ShippingPortalPaymentMethod(driver);
		pm.getInternetBankingRadioButton();
		pm.getsubmitbutton();
		OrderHistory ordertable=new OrderHistory(driver);
		String actualmobile = ordertable.grtlastrowmobilename().getText();
		String expectedmobile = "REDMI NOTE 4 (GOLD, 32 GB) (WITH 3 GB RAM) DEMO";
		System.out.println("actual mobile name+---------->"+actualmobile);
		if(actualmobile.contains(expectedmobile))
		{
			System.out.println("product is orderd sucses");
		}
		else
		{
			System.out.println("product orderd notsucses");
		}
	
			
			
		 }
	     
	   }


