package Practice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {
	
	WebDriver driver= null;
	
	@Before
	
	public void openBrowser(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		
		
	}
	
	
	
	@After
	
	public void closeBrowser(){
		
		driver.close();
		driver.quit();
		
	}
	
	
	public void byType(By by, String x){
		
		driver.findElement(by).sendKeys(x);
		
	}
	
	
	@Test
	
	public void faceBookLogin(){
		
		byType(By.xpath(".//*[@id='u_0_b']"),"Munna"); 
		
		isElementPresent(driver.findElement(By.xpath("//*[@id='blueBarNAXAnchor']/div/div/div/div[1]/h1/a/i")));
	}
	

	
	public void isElementPresent(WebElement e){
		
	
		if(e.isDisplayed()){
			
			System.out.println("Visible");
		}else{
			
			System.out.println("not visible");
		}
		
	}
	

}
