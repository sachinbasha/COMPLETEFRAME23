package com.trendcart.genricUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	/**
	 * author sachin
	 * this method is used to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * author sachin
	 * this method is used minimize the window
	 * @param driver
	 */
	public void minimizewindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void waitUntilElementToBevisible(WebDriver driver,WebElement ele,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitUntilElementToClikable(WebDriver driver,WebElement ele,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void dropdown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void dropdown(WebElement element,String visibleText)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
	}
	public void dropdown(String value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions s=new Actions(driver);
		s.doubleClick(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions s=new Actions(driver);
		s.contextClick(element).perform();
	}
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions s=new Actions(driver);
		s.moveToElement(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement source ,WebElement terget)
	{
		Actions s=new Actions(driver);
		s.dragAndDrop(source, terget);
	}
	public void actionScrollToElement(WebDriver driver,WebElement element)
	{
		Actions s=new Actions(driver);
		s.scrollToElement(element).perform();
	}
	public void actionScrollByAmount(WebDriver driver,int phixel )
	{
		Actions s=new Actions(driver);
		s.scrollByAmount(0,  phixel).perform();
	}
	/*public void javaScriptScrollToElement(WebDriver driver)
	{
	     JavascriptExecutor f=(JavascriptExecutor )driver;
	     f.executeScript()
		
	}*/
	
	public void keyPressEnter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	public void keyReleaseEnter() throws AWTException
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(0);
	}
	public void switchToFrame(WebDriver driver,String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	public void switchToFrame(WebDriver driver,WebElement address)
	{
		driver.switchTo().frame(address);
	}
	public void switchToWindow(WebDriver driver ,String partialWinTitle)
	{
	     Set<String> windows = driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    while(it.hasNext())
	    {
	    	String winid=it.next();
	    	String currentwinTitle= driver.switchTo().window(winid).getTitle();
	    	if(currentwinTitle.equals(partialWinTitle))
	    	{
	    		break;
	    	}
	    }
	}
	public void alert(WebDriver driver)
	{
		driver.switchTo().alert();
	}
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public String alertgetText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	
	public static String getScreenShot(WebDriver driver,String sname) throws IOException
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
	    File src = sh.getScreenshotAs(OutputType.FILE);	
	    String path="./screenshot/"+sname+".png";
	    File destination=new File(path);
	    FileUtils.copyFile(src, destination);
	    return destination.getAbsolutePath();
		
	}
	
	
	
	
	
	
	
	
	
	

}
