package hardPain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alartPop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//to handle alart popup
		
	
		
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/input")).click();;
		Alert alart = driver.switchTo().alert();
		
		//to read the text from alert popup
		
		String msg = alart.getText();
		System.out.println(msg);
		Thread.sleep(10000);
		
		//to accept the alert
		
		alart.accept();
		
		//to cancel, will use "dismiss()"
		
		
	}

}
