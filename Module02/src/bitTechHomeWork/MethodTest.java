package bitTechHomeWork;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MethodTest {
WebDriver driver= null;
	
	@Before
	
	public void openBrowser(){
		
	 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		
		
	}
	
	@After
	
	public void closeBrowser(){
		
		driver.close();
		driver.quit();
	}

	
	public void clickMethod(By by){
		
		driver.findElement(by).click();		
	}
	
	public void verifyTitle( String s){
		
		if(driver.getTitle().contains(s)){
			
			System.out.println("Text is present");
		}else{
				System.out.println("Not present");
		}
	}	
	
	public void verifyUrl(String x)
	{
		
		if(driver.getCurrentUrl().contains(x)){
			
			System.out.println("URL is matched");
			
		}else{
			
			System.out.println("Not matched");
			
		}
		
	
	}
		
	public void verifyText(String y){
		
		if(driver.getPageSource().contains(y)){
			
			System.out.println("PageSource matched");
		}else{
			
			System.out.println("not matched"+driver);
		}
	}
		
	
	
	@Test
	
	public void testMehod(){
		
		
		clickMethod((By.xpath("//button[@id='u_0_s']")));
		
		verifyTitle("Facebook - Log In or Sign Up");
	
		verifyUrl("https://www.facebook.com/?_rdr=p");
		
		verifyText("from friends in News Feed");
	}
	
	
}
