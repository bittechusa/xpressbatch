package bdtech;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	WebDriver dr = new FirefoxDriver();
	@Before
	public void openBrowser(){
		
		dr.get("http//:faceboook.com");	
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@After
	public void closeBrowser(){
		//dr.quit();
	}
	
	public void click(By by)
	{
		dr.findElement(by).click();
		
	}
	
	
	public void verifyTitle(String x)
	{if(dr.getTitle().contains(x)){
		System.out.println("title is match");
	}else{
		System.out.println("title is not match");
	}
		
	}
	
	public void verifyUrl(String s)
	{if(dr.getCurrentUrl().contains(s)){
		System.out.println("url is match");
	}else{
		System.out.println("url is not match");
	}
		
	}
	
	public void verifyText(String y)
	{if(dr.getPageSource().contains(y)){
		System.out.println("text is match");
	}else{
		System.out.println("text is not match");
	}
		
	}
	
	@Test
	public void testmethods(){
		click(By.xpath("//button[@id='u_0_s']"));
        verifyTitle("Facebook - Log In or Sign Up");	
        verifyUrl("https://www.facebook.com/");
        verifyText("See photos and updates");
	}
	
	
		
}
