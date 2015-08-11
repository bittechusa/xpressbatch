package softPain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		//How to navigate a Browser
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http:prothom-alo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='1']/li[11]/a")).click();
		
		//How to do navigate Back
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		// How to do navigate Forward
		
		driver.navigate().forward();
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
