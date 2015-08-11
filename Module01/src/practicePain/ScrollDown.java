package practicePain;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
	
	WebDriver driver;
	 @BeforeTest
	 public void setup() throws Exception {
	  driver =new FirefoxDriver();     
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://rang-bd.com");
	 }
	 
	 @Test
	 public void Scroll_Page() throws IOException, InterruptedException {
	  //To scroll down web page by 600 pixels In x(vertical) direction.  
	  //You can y parameter to scroll page In horizontal direction.
	  JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  
	  Thread.sleep(5000);
	  javascript.executeScript("window.scrollBy(0,1000)", "");
	  
	  Thread.sleep(5000);
	  
	  //To scroll up web page by 300 pixels In x(vertical) direction.
	  javascript.executeScript("window.scrollBy(0,-600)", "");
	  Thread.sleep(5000);
	  driver.close();
	  }

}
