package com.trendcart.testscript;

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

public class TrackOrderTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("EmailAddress");
		String pwd = p.getProperty("Password");*/
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[text()=' Electronics']")).click();
		driver.findElement(By.xpath("//a[text()='Redmi Note 4 (Gold, 32 GB)  (With 3 GB RAM) Demo']")).click();
		driver.findElement(By.xpath("//a[text()=' ADD TO CART']")).click();
		Alert al = driver.switchTo().alert();
		String a = al.getText();
		String popuptext="Product has been added to the cart";
		if(popuptext.equalsIgnoreCase(a))
			System.out.println(popuptext+"popup is displayed");
		else
			System.out.println(popuptext+"popup is not displayed");
		al.accept();
		WebElement updatebutton = driver.findElement(By.name("update"));
		Thread.sleep(1000);
		Actions s=new Actions(driver);
		s.scrollToElement(updatebutton).perform();
		HashMap<String, String> m=new HashMap<String, String>();
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet shet = wb.getSheet("shippingaddress");
		int row = shet.getLastRowNum();
	    for(int i=0;i<=row;i++)
		{
		 String key = wb.getSheet("shippingaddress").getRow(i).getCell(0).getStringCellValue();
		 String value = wb.getSheet("shippingaddress").getRow(i).getCell(1).getStringCellValue();
		 m.put(key, value);
		}
		 for(Entry<String,String>set:m.entrySet())
		 {
		  driver.findElement(By.name(set.getKey())).clear();
		  driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		 }
		 
	   /*  HashMap<String, String> bil=new HashMap<String, String>();
	     int lastrow = wb.getSheet("billingaddress").getLastRowNum();
	  
	     for(int i=0;i<=lastrow;i++)
	     {
	    	String key = wb.getSheet("billingaddress").getRow(i).getCell(0).getStringCellValue();
			String value = wb.getSheet("billingaddress").getRow(i).getCell(1).getStringCellValue();
			bil.put(key, value);
		 }
	     for(Entry<String,String>set:bil.entrySet())
	     {
	    	 driver.findElement(By.name(set.getKey())).clear();
			 driver.findElement(By.name(set.getKey())).sendKeys(set.getValue()); 
	     }*/
		 int lastrow = wb.getSheet("billingaddress").getLastRowNum();
		 for(int i=0;i<lastrow;i++)
			{
			int lastcell = wb.getSheet("billingaddress").getRow(i).getLastCellNum();
			 for(int j=1;j<lastcell;j++)
			 {
				String data =wb.getSheet("billingaddress").getRow(i).getCell(0).getStringCellValue();
				String data2 = wb.getSheet("billingaddress").getRow(i).getCell(1).getStringCellValue();
				driver.findElement(By.name(data)).clear();
				driver.findElement(By.name(data)).sendKeys(data2);
			 }
			}
			driver.findElement(By.cssSelector("button[name='shipupdate']")).click();
			Alert n = driver.switchTo().alert();
			String alerttext = n.getText();
			n.accept();
			String actualpopuptext="Shipping Address has been updated";
			if(alerttext.equalsIgnoreCase(actualpopuptext))
			{
				System.out.println("Shipping Address has been updated pop up is displayed");
			}
			driver.findElement(By.cssSelector("[name='ordersubmit']")).click();
			driver.findElement(By.xpath("//input[@name='paymethod' and @value='COD']")).click();
			driver.findElement(By.name("submit")).click();
			WebElement table = driver.findElement(By.xpath("//form[@name='cart']"));
			List<WebElement> tablerow = table.findElements(By.tagName("tr"));
			int count = tablerow.size()-1;
			System.out.println(count);
			String actualmobile = tablerow.get(count).getText();
			System.out.println(actualmobile);
			String Expectedmobile="Redmi Note 4 (Gold, 32 GB)  (With 3 GB RAM) Demo";
			String expectdata = Expectedmobile.toUpperCase();
			System.out.println(expectdata);
			
			if(actualmobile.contains(expectdata))
			{
				System.out.println("expected mobile is displaye");
			}
			else
			{
				System.out.println("iam sorry");
			}
			
			
			
			
			
			
		 }
	     
	   }


