package com.target.target.test;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	WebDriver driver = null;
	
	@Before
	public void openBrowser()
	{
		
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.target.com/");
		driver.manage().window().maximize();		
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	}
