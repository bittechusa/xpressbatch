package com.target.target.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenuTest {

	

	WebDriver driver = null;
	
	@Before
	public void openBrowser()
	{
		
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();		
	}
	
	@After
	public void closeBrowser() throws InterruptedException
	{
//		Thread.sleep(3000);
//		driver.close();
//		driver.quit();
	}
	
	
	
	public  void type(By by, String x )
	{
		driver.findElement(by).sendKeys(x);
	}
	
	
	
	public void isPresent(WebElement ele)
	{
		//WebElement ele = driver.findElement(by);
		if(ele.isDisplayed())
		{
			System.out.println("Element is Present");
		}else
		{
			System.out.println("Element is not Present");
		}
	}
	
	
	public void clickOnElement(By by)
	{
		driver.findElement(by).click();      
	}
	
	
	public void verifyTitle(String s)
	{
		if(driver.getTitle().contains(s))
		{
			System.out.println("Title is matched");
		}else{
			System.out.println("Title is not matched");
			
		}
	}
	
	
	public void verifyUrl(String st)
	{
		if(driver.getCurrentUrl().contains(st))
		{
			System.out.println("URL is correct");
		}else{
			System.out.println("URL is not correct");
		}
	}
	
	
	public void verifyText(String str)
	{
		if(driver.getPageSource().contains(str))
		{
			System.out.println("Text is present");
		}else{
			System.out.println("Text is not present");
		}
	}
	
	
	
	@Test
	public void dropDown() 
	{
		/*WebElement element = driver.findElement(By.xpath(".//*[@id='month']"));
		Select se = new Select(element);
		int n = se.getOptions().size();
		System.out.println(n);
		//se.selectByIndex(1);
		Thread.sleep(3000);
		for(int i = 1; i<n; i++)
		{
			se.selectByIndex(i);
		}*/
		
		
		verifyUrl("https://www.facebook.com/");
		verifyText("from friends in News Feed.");
	
		type(By.xpath(".//*[@id='u_0_b']"),"Pigush");
		
		verifyTitle("Facebook - Log In or Sign Up");
		
		isPresent(driver.findElement(By.xpath(".//*[@id='blueBarNAXAnchor']/div/div/div/div[1]/h1/a/i")));
	
		clickOnElement(By.xpath("//button[@id='u_0_s']"));
	
	}
}
