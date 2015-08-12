package com.target.target.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class MainMenuTest extends BaseClass {
	@Ignore
	@Test
	public void targetMenuTest()
	{
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='ShopNavMenu']/li"));
		int s = ele.size();
		System.out.println(s);
		for(int i = 1; i<= s; i++)
		{
			 driver.findElement(By.xpath("//ul[@id='ShopNavMenu']/li["+i+"]/a")).click();
			
		}
	}
	
	
	@Test
	public void targetShopAllCategories() throws InterruptedException
	{
		int n = driver.findElements(By.xpath("//ul[@id='MainMenu']/li")).size();
		for(int i = 1; i<=1; i++)
		{
			WebElement myelement = driver.findElement(By.xpath("//ul[@id='MainMenu']/li["+i+"]/span/a"));
			 Actions act = new Actions(driver);
			 act.moveToElement(myelement).perform();
			 
			 WebElement ele = driver.findElement(By.xpath(".//*[@id='MainMenu']/li["+i+"]/div/div"));
			 List<WebElement> links =ele.findElements(By.tagName("a"));
			 int n1 = links.size();
			 String text[] = new String[n1];
			 int j =0;
			 for(WebElement el: links)
			 {
				 if(el.isDisplayed())
				 {
				 text[j] = el.getText();
				 System.out.println( text[j]);
				 j=j+1;
				 }
				 
			 }
			 for(String s: text)
			 {
				 System.out.println("*****************");
				try
				{
					driver.findElement(By.linkText(s)).click();
					Thread.sleep(2000);
					driver.navigate().back();
					System.out.println("go  back");
					Thread.sleep(2000);
					WebElement myelement1 = driver.findElement(By.xpath("//ul[@id='MainMenu']/li["+i+"]/span/a"));
					 Actions at = new Actions(driver);
					 at.moveToElement(myelement1).perform();
					 System.out.println("Mouse over");
					 Thread.sleep(2000);
					
					
				}
				catch(NoSuchElementException e)
				{
				System.out.println("Something is wrong");
									
				}
				
				
			 }
		}
	}
		
	
}
