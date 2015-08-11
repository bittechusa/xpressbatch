package hardPain;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Verify;

public class dragNdrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='content_body']/div/div[1]/div/div[2]/h1"));
		Thread.sleep(5000);
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='slider3']/li[4]/a/img"));
		
		Actions builder = new Actions (driver);
		Action dragdrop = builder.clickAndHold(drag).moveToElement(drop).release(drop).build();
		Thread.sleep(5000);
		
		dragdrop.perform();
		
		driver.close();
		
		
		

	}

}
