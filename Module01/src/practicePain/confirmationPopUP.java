package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class confirmationPopUP {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Handle the confirmation popup
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[1]")).click();
		Alert act = driver.switchTo().alert();
		Thread.sleep(5000);
		act.accept();
		
		driver.close();

	}

}
